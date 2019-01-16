package pl.piotrgalkowski.mediaproject.models.movie;

import pl.piotrgalkowski.mediaproject.models.Rating;

import java.math.BigDecimal;

public class MovieRating extends Rating {

    private BigDecimal imdb;

    public MovieRating(BigDecimal imdb) {
        this.imdb = imdb;
    }

    public BigDecimal getImdb() {
        return imdb;
    }

    public void setImdb(BigDecimal imdb) {
        this.imdb = imdb;
    }
}
