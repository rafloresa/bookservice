package com.rene.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rene.bookservice.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
