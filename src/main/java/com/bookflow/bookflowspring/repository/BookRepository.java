package com.bookflow.bookflowspring.repository;

import com.bookflow.bookflowspring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long>{
    Optional<Book> findByTitleIgnoreCase(String title);
}
