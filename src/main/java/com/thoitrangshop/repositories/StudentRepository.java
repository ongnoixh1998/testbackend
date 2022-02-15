package com.thoitrangshop.repositories;

import com.thoitrangshop.presistence.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,String> {
}
