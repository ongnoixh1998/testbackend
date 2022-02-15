package com.thoitrangshop.services.impl;

import com.thoitrangshop.presistence.StudentEntity;
import com.thoitrangshop.repositories.StudentRepository;
import com.thoitrangshop.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }
}
