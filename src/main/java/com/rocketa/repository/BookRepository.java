package com.rocketa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rocketa.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
