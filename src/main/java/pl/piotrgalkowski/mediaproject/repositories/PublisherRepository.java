package pl.piotrgalkowski.mediaproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.piotrgalkowski.mediaproject.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
