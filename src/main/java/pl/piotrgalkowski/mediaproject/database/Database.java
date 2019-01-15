package pl.piotrgalkowski.mediaproject.database;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.piotrgalkowski.mediaproject.models.Author;
import pl.piotrgalkowski.mediaproject.models.Book;
import pl.piotrgalkowski.mediaproject.models.Publisher;
import pl.piotrgalkowski.mediaproject.repositories.AuthorRepository;
import pl.piotrgalkowski.mediaproject.repositories.BookRepository;
import pl.piotrgalkowski.mediaproject.repositories.PublisherRepository;

@Component
public class Database implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public Database(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher sqn = new Publisher();
        sqn.setName("SQN");
        Publisher pwe = new Publisher();
        pwe.setName("PWE");
        publisherRepository.save(sqn);
        publisherRepository.save(pwe);

        Author jimmyBurns = new Author("Jimmy", "Burns");
        Book cristianoILeo = new Book("Cristiano i Leo", sqn);
        jimmyBurns.getBooks().add(cristianoILeo);
        cristianoILeo.getAuthors().add(jimmyBurns);
        authorRepository.save(jimmyBurns);
        bookRepository.save(cristianoILeo);


        Author rogerFisher = new Author("Roger", "Fisher");
        Author williamUry = new Author("William", "Ury");
        Book dochodzacDoTak = new Book("Dochodząc do tak", pwe);
        rogerFisher.getBooks().add(dochodzacDoTak);
        williamUry.getBooks().add(dochodzacDoTak);
        dochodzacDoTak.getAuthors().add(rogerFisher);
        dochodzacDoTak.getAuthors().add(williamUry);
        authorRepository.save(rogerFisher);
        authorRepository.save(williamUry);
        bookRepository.save(dochodzacDoTak);
    }
}
