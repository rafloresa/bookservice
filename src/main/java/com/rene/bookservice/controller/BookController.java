package com.rene.bookservice.controller;

import org.springframework.web.bind.annotation.*;

import com.rene.bookservice.model.Book;
import com.rene.bookservice.service.BookService;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping(value = "/books")
  public List<Book> getAllBooks() {
    return bookService.getAllBooks();
  }

  @GetMapping(value = "/books/{bookId}")
  public Book getBookById(@PathVariable("bookId") Long bookId) {
    return bookService.getBookByBookId(bookId);
  }

  @PostMapping(value = "/books")
  public void saveBook(@RequestBody Book book) {
    bookService.saveBook(book);
  }

  @PutMapping(value = "/books")
  public void updateBook(@RequestBody Book book) {
    bookService.updateBook(book);
  }

  @DeleteMapping(value = "/books/{bookId}")
  public void deleteBook(@PathVariable("bookId") Long bookId) {
    bookService.deleteBookByBookId(bookId);
  }

}
