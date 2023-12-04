// Dinh Viet Ha - 20215042

package hust.soict.ite6.aims.media.comparators;

import hust.soict.ite6.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media a, Media b) {
        return Comparator.comparingDouble(Media::getCost)
                .reversed()
                .thenComparing(Media::getTitle)
                .compare(a, b);
    }
}
