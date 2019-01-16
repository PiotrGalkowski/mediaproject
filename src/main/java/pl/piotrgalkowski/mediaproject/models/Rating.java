package pl.piotrgalkowski.mediaproject.models;

import java.math.BigDecimal;

public abstract class Rating {

    private BigDecimal myRating = BigDecimal.ZERO;

    public BigDecimal getMyRating() {
        return myRating;
    }

    public void setMyRating(BigDecimal myRating) {
        this.myRating = myRating;
    }
}

