package pl.piotrgalkowski.mediaproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.piotrgalkowski.mediaproject.models.Author;

/**
 * Created by jt on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
