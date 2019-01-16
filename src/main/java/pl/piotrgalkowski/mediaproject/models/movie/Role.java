package pl.piotrgalkowski.mediaproject.models.movie;

public enum Role {

    DIRECTOR("Reżyser"), SCREENWRITER("Scenarzysta"), ACTOR("Aktor/ka");

    private String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
