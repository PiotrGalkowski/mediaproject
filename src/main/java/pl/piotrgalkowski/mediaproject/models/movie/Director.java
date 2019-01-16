package pl.piotrgalkowski.mediaproject.models.movie;

import pl.piotrgalkowski.mediaproject.models.Nationality;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String LastName;
    @Enumerated(EnumType.STRING)
    private Nationality nationality;
    @ManyToMany
    private Set<Movie> movies;
    //reboot – film podejmujący tematykę wcześniejszego bądź wcześniejszych filmów z serii, niebędący jednak ich bezpośrednią kontynuacją ani prequelem

//    Remake (wym. 'riːmɛɪk, ang. wytwarzać coś ponownie) – termin odnoszący się do filmów i gier komputerowych, które zostały nakręcone bądź stworzone
//    na nowo, z różnym stopniem zmian. Remakiem nie jest zazwyczaj nazywana ponowna adaptacja tego samego materiału źródłowego np. sztuki, książki, opowiadania,
//    a jedynie utwór stworzony ponownie, na podstawie tego samego, bądź do pewnego stopnia zmienionego scenariusza.
}
