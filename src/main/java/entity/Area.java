package entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
@Entity
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @Column(name = "places")
    private Integer numberOfPlaces;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumOfPlaces() {
        return numberOfPlaces;
    }
    public void setNumOfPlaces(Integer numOfPlaces) {
        this.numberOfPlaces = numOfPlaces;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", number of places=" + numberOfPlaces +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
