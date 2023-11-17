// Dinh Viet Ha - 20215042
// hust.soict.ite6.aims.disc.DigitalVideoDisc.java

package hust.soict.ite6.aims.disc;

public class DigitalVideoDisc {
    public static int nbDigitalVideoDiscs = 0;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;

    public DigitalVideoDisc(String title) {
        setTitle(title);
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this(title);
        setCategory(category);
        setCost(cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(category, title, cost);
        setDirector(director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(director, category, title, cost);
        setLength(length);
    }

    public String toString() {
        return String.format("DVD - %s - %s - %s - %d: $%f", title, category, director, length, cost);
    }

    public boolean isMatch(String title) {
        boolean equals = this.title.equals(title);
        return equals;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }
}
