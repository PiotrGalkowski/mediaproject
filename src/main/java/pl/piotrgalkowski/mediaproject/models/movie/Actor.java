package pl.piotrgalkowski.mediaproject.models.movie;

import pl.piotrgalkowski.mediaproject.models.Image;
import pl.piotrgalkowski.mediaproject.models.Nationality;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private Nationality nationality;
    @ManyToMany
    private Set<Movie> movies;
    @OneToMany
    private Set<Image> images;


}
