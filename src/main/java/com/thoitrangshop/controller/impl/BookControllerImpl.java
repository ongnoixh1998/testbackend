package com.thoitrangshop.controller.impl;

import com.thoitrangshop.controller.BookController;
import com.thoitrangshop.controller.model.BookCreateRequest;
import com.thoitrangshop.controller.model.LendingCreateRequest;
import com.thoitrangshop.services.BookService;
import com.thoitrangshop.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Map;

@RestController("/book")
public class BookControllerImpl implements BookController {
    @Autowired
    BookService bookService;
    @Autowired
    StudentService studentService;
    @Override
    public ResponseEntity<Map> getBook() {
        return ResponseEntity.ok(Map.of("success",true,"data",bookService.findAll()));
    }

    @Override
    public ResponseEntity<Map> createBook(BookCreateRequest request) throws ParseException {
        bookService.create(request);
        return ResponseEntity.ok(Map.of("success",true));
    }

    @Override
    public ResponseEntity<Map> getLeding() {
        return null;
    }

    @Override
    public ResponseEntity<Map> createLending(LendingCreateRequest request) throws ParseException {
        bookService.lending(request);
        return ResponseEntity.ok(Map.of("success",true));
    }

    @Override
    public ResponseEntity<Map> deleteLending(String bookId, String studentId) {
        bookService.deleteLending(bookId,studentId);
        return ResponseEntity.ok(Map.of("success",true));
    }
}
