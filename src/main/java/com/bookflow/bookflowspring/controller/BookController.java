package com.bookflow.bookflowspring.controller;
import org.springframework.web.bind.annotation.*;
import com.bookflow.bookflowspring.service.BookService;
import com.bookflow.bookflowspring.model.Book;
import java.util.List;

@RestController

public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody double newPrice) {
        return bookService.updateBook(id, newPrice);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }
}

