package pl.piotrgalkowski.mediaproject.models.movie;

public enum MovieType {

    NEW("Nowy"),
    REBOOT("Reboot"),
    REMAKE("Remake"),
    SEQUEL("Sequel"),
    PREQUEL("Prequel");

    private String name;
    private Movie ofMovie;

    MovieType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie getOfMovie() {
        return ofMovie;
    }

    public void setOfMovie(Movie ofMovie) {
        this.ofMovie = ofMovie;
    }
}
