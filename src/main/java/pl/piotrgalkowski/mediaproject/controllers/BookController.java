package pl.piotrgalkowski.mediaproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.piotrgalkowski.mediaproject.models.book.Book;
import pl.piotrgalkowski.mediaproject.models.book.Publisher;
import pl.piotrgalkowski.mediaproject.repositories.book.BookRepository;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public String getBooks(Model model) {

        Book book = new Book();
        book.setTitle("Barcelona");
        book.setPublisher(new Publisher("PWE"));

        bookRepository.save(book);

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
