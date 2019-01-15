package pl.piotrgalkowski.mediaproject.repositories.book;

import org.springframework.data.repository.CrudRepository;
import pl.piotrgalkowski.mediaproject.models.book.Book;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
