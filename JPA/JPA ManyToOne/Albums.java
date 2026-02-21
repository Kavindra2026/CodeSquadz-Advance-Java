package mypack;

import javax.persistence.*;

@Entity
@Table(name = "albums")
public class Albums {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "album_id")
    private int album_id;

    @Column(name = "album_name")
    private String album_name;

    @Column(name = "album_year")
    private int album_year;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Albums() {
    }

    public Albums(int album_id, String album_name, int album_year, Artist artist) {
        this.album_id = album_id;
        this.album_name = album_name;
        this.album_year = album_year;
        this.artist = artist;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public int getAlbum_year() {
        return album_year;
    }

    public void setAlbum_year(int album_year) {
        this.album_year = album_year;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
