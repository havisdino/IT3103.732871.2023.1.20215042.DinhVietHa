// Dinh Viet Ha - 20215042

package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static final int MAX_ITEMS = 100;
    private List<Media> itemsInStore = new ArrayList<>();

    public boolean addMedia(Media media) {
        if (itemsInStore.size() == MAX_ITEMS) {
            System.out.println("Store already full");
            return false;
        } else {
            itemsInStore.add(media);
            System.out.println("Item added successfully");
            return true;
        }
    }

    public boolean removeMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            System.out.println("Item not found");
            return false;
        } else {
            itemsInStore.remove(media);
            System.out.println("Item removed successfully");
            return true;
        }
    }

    public boolean removeMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                itemsInStore.remove(item);
                System.out.println("Item removed");
                return true;
            }
        }
        System.out.println("Item not found");
        return false;
    }

    public void show() {
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

    public Media search(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                System.out.println("Item found:");
                System.out.println(item.toString());
                return item;
            }
        }
        System.out.println("No such item");
        return null;
    }
}
