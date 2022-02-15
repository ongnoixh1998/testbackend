package com.thoitrangshop.controller.impl;

import com.thoitrangshop.controller.StudentController;
import com.thoitrangshop.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentControllerImpl implements StudentController {
    @Autowired
    StudentService studentService;
    @Override
    public ResponseEntity<Map> getStudents() {
        return ResponseEntity.ok(Map.of("success",true,"data",studentService.findAll()));
    }
}
