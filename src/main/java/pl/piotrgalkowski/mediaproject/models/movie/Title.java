package pl.piotrgalkowski.mediaproject.models.movie;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Title {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titlePl;
    private String titleEng;
    private String titleOrigin;
    @OneToOne
    private Movie movie;

    public Title(String titleOrigin, Movie movie) {
        this.titleOrigin = titleOrigin;
        this.movie = movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitlePl() {
        return titlePl;
    }

    public void setTitlePl(String titlePl) {
        this.titlePl = titlePl;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public void setTitleEng(String titleEng) {
        this.titleEng = titleEng;
    }

    public String getTitleOrigin() {
        return titleOrigin;
    }

    public void setTitleOrigin(String titleOrigin) {
        this.titleOrigin = titleOrigin;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Title title = (Title) o;
        return Objects.equals(id, title.id) &&
                Objects.equals(titlePl, title.titlePl) &&
                Objects.equals(titleEng, title.titleEng) &&
                Objects.equals(titleOrigin, title.titleOrigin) &&
                Objects.equals(movie, title.movie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titlePl, titleEng, titleOrigin, movie);
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", titlePl='" + titlePl + '\'' +
                ", titleEng='" + titleEng + '\'' +
                ", titleOrigin='" + titleOrigin + '\'' +
                ", movie=" + movie +
                '}';
    }
}
