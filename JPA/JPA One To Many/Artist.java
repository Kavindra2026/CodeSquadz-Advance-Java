package mypack;

import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.util.*;

@Entity
@Table(name="artists")
public class Artist {

    @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "artist_id")
    private int artist_id;

    @Column(name = "artist_name")
    private String artist_name;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="artist_id")
    private List<Albums> albums;

    public Artist() {
    }

    public Artist(int artist_id, String artist_name) {
        this.artist_id = artist_id;
        this.artist_name = artist_name;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public List<Albums> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Albums> albums) {
        this.albums = albums;
    }
}
