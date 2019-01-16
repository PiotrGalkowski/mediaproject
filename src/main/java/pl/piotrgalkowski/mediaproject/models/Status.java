package pl.piotrgalkowski.mediaproject.models;

public enum Status {

    WATCHED("Obejrzany"), NOT_WATCHED("Do obejrzenia");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
