package com.bfs.projectstory.restapipracticefive.repository;

import com.bfs.projectstory.restapipracticefive.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
