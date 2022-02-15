package com.thoitrangshop.repositories;

import com.thoitrangshop.presistence.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity,String> {
}
