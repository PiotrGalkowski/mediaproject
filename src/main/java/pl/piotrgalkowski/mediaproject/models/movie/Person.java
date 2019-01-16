package pl.piotrgalkowski.mediaproject.models.movie;

import pl.piotrgalkowski.mediaproject.models.Image;
import pl.piotrgalkowski.mediaproject.models.Nationality;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private Nationality nationality;
    private Role role;
    @ManyToMany
    private Set<Movie> movies;
    @OneToMany
    private Set<Image> images;

    @OneToMany
    @JoinTable(name = "personList_director",
            joinColumns = @JoinColumn(name = "personList_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id"))
    private Set<Director> directors;

    @OneToMany
    @JoinTable(name = "personList_screenwriter",
            joinColumns = @JoinColumn(name = "personList_id"),
            inverseJoinColumns = @JoinColumn(name = "screenwriter_id"))
    private Set<ScreenWriter> screenWriters;

    @OneToMany
    @JoinTable(name = "personList_screenwriter",
            joinColumns = @JoinColumn(name = "personList_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private Set<Actor> cast;
}
