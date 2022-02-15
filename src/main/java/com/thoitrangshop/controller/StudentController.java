package com.thoitrangshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;


public interface StudentController {
    @GetMapping("")
    ResponseEntity<Map> getStudents();
}
