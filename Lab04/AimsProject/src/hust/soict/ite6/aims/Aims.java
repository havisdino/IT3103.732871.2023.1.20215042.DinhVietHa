// Dinh Viet Ha - 20215042

package hust.soict.ite6.aims;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.*;
import hust.soict.ite6.aims.store.Store;

import java.util.Scanner;

public class Aims {
    public static Scanner scanner = new Scanner(System.in);
    public static Store store = new Store();
    public static Cart cart = new Cart();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("AIMS");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0, 1, 2, 3");
            System.out.print("--> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    storeMenu();
                    continue;
                case 2:
                    updateStoreMenu();
                    continue;
                case 3:
                    cartMenu();
                    continue;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            break;
        }

    }

    public static void updateStoreMenu() {
        while (true) {
            System.out.println("Options");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media");
            System.out.println("2. Remove a media");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("--> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    Media newItem = createNewMedia();
                    store.addMedia(newItem);
                    continue;
                case 2:
                    System.out.print("Enter the media title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    store.removeMedia(title);
                    continue;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            break;
        }
    }

    public static Media createNewMedia() {
        Media item;

        System.out.println("Enter the info");
        System.out.print("Title: ");
        scanner.nextLine();
        String title = scanner.nextLine();
        System.out.print("Cost: ");
        float cost = scanner.nextFloat();

        while (true) {
            System.out.println("Choose a media type:");
            System.out.println("1. Book");
            System.out.println("2. DVD");
            System.out.println("3. CD");
            System.out.println("0. Back");
            System.out.print("--> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    return null;
                case 1:
                    item = new Book(title, cost);
                    break;
                case 2:
                    item = new DigitalVideoDisc(title, cost);
                    break;
                case 3:
                    item = new CompactDisc(title, cost);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            break;
        }

        return item;
    }

    public static void storeMenu() {
        while (true) {
            System.out.println("Options");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0, 1, 2, 3, 4");
            System.out.print("--> ");

            String title;
            Media item;
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter the media title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item = store.search(title);
                    if (item != null) {
                        mediaDetailsMenu(item);
                    }
                    continue;
                case 2:
                    System.out.print("Enter the media title: ");
                    title = scanner.nextLine();
                    item = store.search(title);
                    if (item != null) {
                        cart.addMedia(item);
                    }
                    continue;
                case 3:
                    System.out.print("Enter the media title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item = store.search(title);
                    if (item instanceof Playable) {
                        ((Playable) item).play();
                    } else if (item != null) {
                        System.out.println("This item is not playable");
                    }
                    continue;
                case 4:
                    cart.print();
                    continue;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            break;
        }
    }

    public static void mediaDetailsMenu(Media item) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0, 1, 2");
            System.out.print("--> ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    cart.addMedia(item);
                    continue;
                case 2:
                    if (item instanceof Book) {
                        System.out.println("Books are not playable");
                    } else if (item instanceof Playable) {
                        ((Playable) item).play();
                    }
                    continue;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            break;
        }
    }

    public static void cartMenu() {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            System.out.print("--> ");

            int choice = scanner.nextInt();
            String title;
            Media item;
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter a title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    System.out.println(cart.search(title));
                    continue;
                case 2:
                    cart.getItemsOrdered().sort(Media.COMPARE_BY_TITLE_COST);
                    continue;
                case 3:
                    System.out.print("Enter a title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item = cart.search(title);
                    if (item != null) {
                        cart.removeMedia(item);
                    }
                    continue;
                case 4:
                    System.out.print(("Enter a title: "));
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item = cart.search(title);
                    if (item == null) {
                        continue;
                    }
                    if (item instanceof Playable) {
                        ((Playable) item).play();
                    } else {
                        System.out.println("Item not playable");
                    }
                    continue;
                case 5:
                    System.out.print("Enter a title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    item = store.search(title);
                    if (item != null) {
                        cart.addMedia(item);
                    }
                    continue;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            break;
        }
    }
}
