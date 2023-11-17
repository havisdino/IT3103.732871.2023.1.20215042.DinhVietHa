// Dinh Viet Ha 20215042
// hust.soict.ite6.test.store.StoreTest.java

package hust.soict.ite6.test.store;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("DVD 1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("DVD 2");
        Store store = new Store();
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        store.removeDVD(dvd1);
    }
}


