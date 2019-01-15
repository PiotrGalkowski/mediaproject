package pl.piotrgalkowski.mediaproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.piotrgalkowski.mediaproject.models.Book;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
