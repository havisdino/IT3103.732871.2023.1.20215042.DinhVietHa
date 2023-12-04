// Dinh Viet Ha - 20215042
// hust.soict.ite6.aims.cart.Cart.java

package hust.soict.ite6.aims.cart;

import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<>();

    public boolean addMedia(Media media) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {   // Check if the cart is full
            System.out.println("The cart is already full");
            return false;
        } else {
            itemsOrdered.add(media);
            System.out.println("Item added");
            return true;
        }
    }

    public boolean removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {    // Check if the item existed
            System.out.println("No such item found");
            return false;
        } else {
            itemsOrdered.remove(media);
            System.out.println("Item removed");
            return true;
        }
    }

    public float totalCost() {
        float sum = 0f;
        // Iterate over the whole list of ordered items and sum up the prices
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public Media search(int id) {
        for (Media item : itemsOrdered) {
            if (item.getId() == id) {   // Iterate over the ordered item list and check if there is an id matching
                System.out.println("Item found");    // Return the item that matches
                return item;
            }
        }
        System.out.println("No item found");
        return null;    // If there is no item found, inform and return null
    }

    public Media search(String title) {
        for (Media item : itemsOrdered) {   // Iterate over the ordered item list and check if there is title matching
            if (item.getTitle().equals(title)) {
                System.out.println("Item found");
                return item;    // Return the item that matches
            }
        }
        System.out.println("No item found");
        return null;    // If there is no item found, notify and return null
    }

    public void print() {
        System.out.println("*********************** CART ***********************");
        for (Media item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: $" + totalCost());   // Show the total cost
        System.out.println("****************************************************");
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }
}
