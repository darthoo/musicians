package entity;

import java.util.List;

/**
 * Created by ������� on 12.03.2017.
 */
public class Band {
    private String name;

    private List<Artist> artists;

    private Genre genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Band{" +
                "name='" + name + '\'' +
                ", artists=" + artists +
                ", genre=" + genre +
                '}';
    }
}
