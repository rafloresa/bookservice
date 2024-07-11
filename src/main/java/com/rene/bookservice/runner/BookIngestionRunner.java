package com.rene.bookservice.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.rene.bookservice.model.Book;
import com.rene.bookservice.service.BookService;

@Component
public class BookIngestionRunner implements ApplicationRunner {

  private final BookService bookService;

  public BookIngestionRunner(BookService bookService) {
    this.bookService = bookService;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    bookService.saveBook(
      new Book(
        1L,
        "Java",
        "https://trishagee.com/wp-content/uploads/2022/09/hfj-3ed-886x1024.jpg",
        10.0));
    bookService.saveBook(new Book(2L, "Python", "https://m.media-amazon.com/images/I/411t3aQzVaL.jpg", 12.0));
    bookService.saveBook(new Book(3L, "JavaScript", "https://m.media-amazon.com/images/I/91-PASfiUVL._AC_UF1000,1000_QL80_.jpg", 9.0));
    bookService.saveBook(new Book(4L, "Ruby", "https://m.media-amazon.com/images/I/41oAv6o2srL.jpg", 5.0));
  }

}
