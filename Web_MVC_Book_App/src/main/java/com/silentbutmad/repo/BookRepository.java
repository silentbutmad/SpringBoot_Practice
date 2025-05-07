package com.silentbutmad.repo;

import com.silentbutmad.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {
}
