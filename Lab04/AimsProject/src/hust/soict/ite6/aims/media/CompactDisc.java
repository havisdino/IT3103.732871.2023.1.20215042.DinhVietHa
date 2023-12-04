// Dinh Viet Ha - 20215042

package hust.soict.ite6.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

    public CompactDisc(String title, float cost) {
        super(title, cost);
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List<Track> tracks) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks.addAll(tracks);
    }

    public boolean addTrack(Track track) {
        if (tracks.contains(track)) {   // Check if the track is already right in
            System.out.println("Track already existed");
            return false;
        } else {    // If the track has not been existed, add it
            tracks.add(track);
            System.out.println("Track added successfully");
            return true;
        }
    }

    public boolean removeTrack(Track track) {
        if (!tracks.contains(track)) {  // Check if there is such a track
            System.out.println("No such track found");
            return false;
        } else {
            tracks.remove(track);   // If it does exist, remove it
            System.out.println("Track removed successfully");
            return true;
        }
    }

    public void play() {
        for (Track track : tracks) {
            track.play();       // Iterate over the track list and play them all
        }
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {    // Iterate over the track list
            length += track.getLength();    // Sum up the track lengths
        }
        return length;
    }

    @Override
    public String toString() {
        return String.format("CD - %s - %s - %s - %d: $%f",
                getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }
}
