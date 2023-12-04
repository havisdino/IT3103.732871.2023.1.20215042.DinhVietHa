// Dinh Viet Ha 20215042
// hust.soict.ite6.test.cart.CartTest.java

package hust.soict.ite6.test.cart;

import hust.soict.ite6.aims.cart.Cart;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Media;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Media dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        // Test the search methods
        System.out.println(cart.search(1).toString());
        System.out.println(cart.search("Star wars").toString());
    }
}
