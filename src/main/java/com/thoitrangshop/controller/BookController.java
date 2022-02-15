package com.thoitrangshop.controller;

import com.thoitrangshop.controller.model.BookCreateRequest;
import com.thoitrangshop.controller.model.LendingCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Map;

public interface BookController {
    @GetMapping("/book")
    ResponseEntity<Map> getBook();
    @PostMapping("/book")
    ResponseEntity<Map> createBook(@RequestBody BookCreateRequest request) throws ParseException;
    @GetMapping("/lending")
    ResponseEntity<Map> getLeding();
    @PostMapping("/lending")
    ResponseEntity<Map> createLending(@RequestBody LendingCreateRequest request) throws ParseException;
    @DeleteMapping("/lending")
    ResponseEntity<Map> deleteLending(@RequestParam("bookId") String bookId,
                                      @RequestParam("studentId") String id);

}
