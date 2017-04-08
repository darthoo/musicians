package entity;

import javax.persistence.*;

/**
 * Created by Odyniuk on 21/03/2017.
 */
@Entity
public class Composition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "composition_id")
    private Integer id;

    private String name;

    private String artist;

    private Float duration;

    private Float rating;


    public Composition() {
    }

    public Composition(String name, String artist, Float duration, Float rating) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}
