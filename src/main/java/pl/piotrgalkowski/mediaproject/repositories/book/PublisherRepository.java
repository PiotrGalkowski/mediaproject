package pl.piotrgalkowski.mediaproject.repositories.book;

import org.springframework.data.repository.CrudRepository;
import pl.piotrgalkowski.mediaproject.models.book.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
