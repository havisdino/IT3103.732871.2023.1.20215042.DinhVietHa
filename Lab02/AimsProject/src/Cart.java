// Dinh Viet Ha - 20215042
// Cart.java

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
}
