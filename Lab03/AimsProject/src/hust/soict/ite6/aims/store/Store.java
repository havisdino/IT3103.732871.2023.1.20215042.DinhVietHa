package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyItems = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyItems + 1 > MAX_ITEMS) {     // Check if the quantity exceeds the capacity
            System.out.println("The store is already full");
        } else {
            itemsInStore[qtyItems] = dvd;
            qtyItems++;     // Update number of DVDs
            System.out.println("DVD has been added");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (qtyItems == 0) {      // Do nothing if the store is empty
            System.out.println("The store is empty");
        } else {
            for (int i = 0; i < qtyItems; i++) {
                if (itemsInStore[i].equals(dvd)) {
                    for (int j = i; j < qtyItems - 1; j++) {  // Forward all the elements from the current position on by 1
                        itemsInStore[j] = itemsInStore[j + 1];
                    }
                    break;      // Only remove the dvd disc with the given value
                }
            }
            qtyItems--;       // Decrease the quantity
            itemsInStore[qtyItems] = null;    // Make the redundant tail null
            System.out.println("The DVD has been removed");
        }
    }
}
