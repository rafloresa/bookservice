package com.rene.bookservice.service;

import com.rene.bookservice.model.Book;
import com.rene.bookservice.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public void saveBook(final Book book) {
    bookRepository.save(book);
  }

  public Book getBookByBookId(final Long bookId) {
    return bookRepository.findById(bookId).orElse(null);
  }

  public void updateBook(final Book book) {
    bookRepository.save(book);
  }

  public void deleteBookByBookId(final Long bookId) {
    bookRepository.deleteById(bookId);
  }

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }
}
