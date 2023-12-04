// Dinh Viet Ha - 20215042

package hust.soict.ite6.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc() {}

    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, float cost) {
        super(title, cost);
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
