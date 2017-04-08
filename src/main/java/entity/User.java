package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Odyniuk on 21/03/2017.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    private String name;

    private Integer age;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_composition", joinColumns = {
            @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "composition_id") })
    private List<Composition> compositions = new ArrayList<Composition>(0);

    public User() {
    }

    public User(String name, Integer age, List<Composition> compositions) {
        this.name = name;
        this.age = age;
        this.compositions = compositions;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Composition> getCompositions() {
        return compositions;
    }

    public void setCompositions(List<Composition> compositions) {
        this.compositions = compositions;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", compositions=" + compositions +
                '}';
    }
}
