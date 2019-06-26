package main.java.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

    // standard constructors

    private final main.java.repositories.BookRepository bookRepository;

    public BookController(main.java.repositories.BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping("/users")
    public List<main.java.entyties.Book> getUsers() {
        return (List<main.java.entyties.Book>) bookRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody main.java.entyties.Book book) {
        bookRepository.save(book);
    }
}
