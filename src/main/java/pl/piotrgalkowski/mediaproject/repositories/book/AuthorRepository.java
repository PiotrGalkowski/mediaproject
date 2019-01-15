package pl.piotrgalkowski.mediaproject.repositories.book;

import org.springframework.data.repository.CrudRepository;
import pl.piotrgalkowski.mediaproject.models.book.Author;

/**
 * Created by jt on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
