package pl.piotrgalkowski.mediaproject.models.movie;

import javax.persistence.*;
import java.util.Set;

@Entity
public enum Genre {

    HORROR("Horror"), SCI_FI("Sci-Fi"), ROMANCE("Romans"), ACTION("Akcja");

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    private Set<Movie> movies;

    Genre(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
}
