package pl.piotrgalkowski.mediaproject.models.movie;

import pl.piotrgalkowski.mediaproject.models.Status;
import pl.piotrgalkowski.mediaproject.models.Trailer;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Title title;
    private int year;

    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Enumerated(EnumType.STRING)
    private Status movieStatus;

    private String description;
    private Time length;

    @OneToMany
    @JoinTable(name = "movie_trailer",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "trailer_id"))
    private Set<Trailer> trailerUrls;

    @ElementCollection
    private Set<String> imageSources;

    @ManyToMany
    @Enumerated(EnumType.STRING)
    @JoinTable(name = "movie_genre",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;

    @OneToOne
    private MovieRating rating;

    @ManyToMany
    private List<Person> personList;
}
