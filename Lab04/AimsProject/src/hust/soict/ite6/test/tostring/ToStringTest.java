// Dinh Viet Ha - 20215042

package hust.soict.ite6.test.tostring;

import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.CompactDisc;
import hust.soict.ite6.aims.media.DigitalVideoDisc;
import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {
    public static void main(String[] args) {
        List<Media> ms = new ArrayList<>();
        ms.add(new CompactDisc(1, "Some CD", "Cartoon", 1f, 2, "Peter"));
        ms.add(new DigitalVideoDisc("Thomas", "Action film", "Some DVD", 9f));
        ms.add(new Book(0, "Some book", "Scientific book", 10f));
        for (Media m : ms) {
            System.out.println(m.toString());
        }
    }
}
