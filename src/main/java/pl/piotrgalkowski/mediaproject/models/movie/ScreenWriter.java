package pl.piotrgalkowski.mediaproject.models.movie;

import javax.persistence.*;

@Entity
@Table(name = "screenwriter")
public class ScreenWriter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
}
