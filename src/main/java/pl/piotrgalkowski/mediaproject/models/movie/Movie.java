package pl.piotrgalkowski.mediaproject.models.movie;

import pl.piotrgalkowski.mediaproject.models.movie.ScreenWriter;
import pl.piotrgalkowski.mediaproject.models.movie.Trailer;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titlePl;
    private String titleEng;
    private Date year;
    private boolean remake;
    private String description;
    private Time length;
    @OneToMany
    @JoinTable(name = "movie_trailer",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "trailer_id"))
    private Set<Trailer> trailerUrls;
//    @OneToMany
//    private Set<String> direction;
//    @OneToMany
//    private List<String> imageSources;
    @OneToMany
    @JoinTable(name = "movie_screenwriter",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "screenwriter_id"))
    private Set<ScreenWriter> scenario;
    @OneToMany
    private Set<Genre> genres;
}
