// Dinh Viet Ha - 20215042
// hust.soict.ite6.aims.cart.Cart.java

package hust.soict.ite6.aims.cart;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {     // Check if the quantity exceeds the maximum quantity
            System.out.println("The cart is already full");
        } else {
            itemsOrdered[qtyOrdered] = disc;    // Add the disc into the disc list
            qtyOrdered++;       // Update the quantity
            System.out.println("The disc has been added");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
       for (DigitalVideoDisc dvd : dvdList) {  // Iterate over the list
           addDigitalVideoDisc(dvd);
       }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {      // Do nothing if the cart is empty
            System.out.println("The cart is empty");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i].equals(disc)) {
                    for (int j = i; j < qtyOrdered - 1; j++) {  // Forward all the elements from the current position on by 1
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    break;      // Only remove the first disc with the given value
                }
            }
            qtyOrdered--;       // Decrease the quantity
            itemsOrdered[qtyOrdered] = null;    // Make the redundant tail null
            System.out.println("The disc has been removed");
        }
    }

    public float totalCost() {
        float sum = 0f;
        // Iterate over the whole list of ordered items and sum the prices all
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public DigitalVideoDisc search(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {    // Iterate over the ordered item list and check if there is an id matching
                System.out.println("DVD found");
                return itemsOrdered[i];             // Return the item that matches
            }
        }
        System.out.println("No DVD found");
        return null;    // If there is no item found, notify and return null
    }

    public DigitalVideoDisc search(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {    // Iterate over the ordered item list and check if there is title matching
                System.out.println("DVD found");
                return itemsOrdered[i];             // Return the item that matches
            }
        }
        System.out.println("No DVD found");
        return null;    // If there is no item found, notify and return null
    }

    public void print() {
        System.out.println("*********************** CART ***********************");
        for (int i = 0; i < qtyOrdered; i++) {      // Iterate over the ordered items
            System.out.println(itemsOrdered[i].toString()); // Show each item's info
        }
        System.out.println("Total cost: $" + totalCost());   // Show the total cost
        System.out.println("****************************************************");
    }
}
