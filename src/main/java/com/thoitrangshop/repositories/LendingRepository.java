package com.thoitrangshop.repositories;

import com.thoitrangshop.presistence.BookAndStudentKey;
import com.thoitrangshop.presistence.LendingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface LendingRepository extends JpaRepository<LendingEntity, BookAndStudentKey> {
    @Query("SELECT lending FROM LendingEntity lending WHERE bookEntity.id=:bookId AND studentEntity.id=:studentId")
    LendingEntity findByBookAndStudentKey(@Param("bookId") String bookId, @Param("studentId") String studentId);
}
