package pl.piotrgalkowski.mediaproject.models.movie;

public enum Genre {

    HORROR("Horror"), SCI_FI("Sci-Fi"), ROMANCE("Romans"), ACTION("Akcja");

    private String name;

    Genre(String name) {
        this.name = name;
    }
}
