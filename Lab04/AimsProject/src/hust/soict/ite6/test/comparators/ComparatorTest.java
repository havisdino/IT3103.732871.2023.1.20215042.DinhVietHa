// Dinh Viet Ha - 20215042

package hust.soict.ite6.test.comparators;

import hust.soict.ite6.aims.media.Book;
import hust.soict.ite6.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Media> m = new ArrayList<>();
        m.add(new Book(0, "B-Book", "Scientific book", 10f));
        m.add(new Book(1, "C-Book", "Nonsense book", 18f));
        m.add(new Book(1, "C-Book", "Nonsense book", 20f));
        m.add(new Book(2, "A-Book", "Comic", 3f));

        System.out.println("Sort by cost then title:");
        Collections.sort(m, Media.COMPARE_BY_COST_TITLE);
        m.forEach(System.out::println);

        System.out.println("\nSort by title then cost:");
        Collections.sort(m, Media.COMPARE_BY_TITLE_COST);
        m.forEach(System.out::println);
    }
}
