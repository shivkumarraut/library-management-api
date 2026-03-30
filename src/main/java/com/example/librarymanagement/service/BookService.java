package com.example.librarymanagement.service;

import com.example.librarymanagement.model.Book;
import com.example.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Add new book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Update existing book
    public Book updateBook(Long id, Book updatedBook) {
        updatedBook.setId(id);
        return bookRepository.save(updatedBook);
    }

    // Delete book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
