package com.thoitrangshop.services;

import com.thoitrangshop.controller.model.BookCreateRequest;
import com.thoitrangshop.controller.model.LendingCreateRequest;
import com.thoitrangshop.presistence.BookEntity;

import java.text.ParseException;
import java.util.List;

public interface BookService {
    List<BookEntity> findAll();
    BookEntity create(BookCreateRequest request) throws ParseException;
    void lending(LendingCreateRequest request) throws ParseException;
    void deleteLending(String bookId,String studentId);
}
