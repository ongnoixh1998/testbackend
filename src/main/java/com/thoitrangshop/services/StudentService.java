package com.thoitrangshop.services;

import com.thoitrangshop.presistence.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> findAll();
}
