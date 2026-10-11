package com.bookflow.bookflowspring.service;

import com.bookflow.bookflowspring.exception.BookNotFoundException;
import com.bookflow.bookflowspring.model.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.bookflow.bookflowspring.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
         this.bookRepository = bookRepository;
     }

    public Book addBook(Book book) {
       return bookRepository.save(book);
    }

    public Book findByTitle(String title) {
        Optional<Book> book = bookRepository.findByTitleIgnoreCase(title);
        if (book.isPresent()){
            return book.get();
        }
        return null;
    }
    public Book findById(Long id){
        Optional<Book> book = bookRepository.findById(id);

        if (book.isPresent()){
            return book.get();
        }
        throw new BookNotFoundException("book not found with id " + id);
    }
    public Book updateBook(Long id, double newPrice){
        Book book = findById(id);

        book.setPrice(newPrice);
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){
        Book book = findById(id);
        bookRepository.delete(book);
    }
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}