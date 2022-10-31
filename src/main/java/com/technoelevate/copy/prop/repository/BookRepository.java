package com.technoelevate.copy.prop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoelevate.copy.prop.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}