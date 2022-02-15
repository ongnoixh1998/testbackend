package com.thoitrangshop.services.impl;

import com.thoitrangshop.controller.model.BookCreateRequest;
import com.thoitrangshop.controller.model.LendingCreateRequest;
import com.thoitrangshop.presistence.BookAndStudentKey;
import com.thoitrangshop.presistence.BookEntity;
import com.thoitrangshop.presistence.LendingEntity;
import com.thoitrangshop.presistence.StudentEntity;
import com.thoitrangshop.repositories.BookRepository;
import com.thoitrangshop.repositories.LendingRepository;
import com.thoitrangshop.repositories.StudentRepository;
import com.thoitrangshop.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired BookRepository bookRepository;
    @Autowired StudentRepository studentRepository;
    @Autowired LendingRepository lendingRepository;

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public BookEntity create(BookCreateRequest request) throws ParseException {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(request.getId());
        bookEntity.setName(request.getName());
        bookEntity.setAuthor(request.getAuthor());
        bookEntity.setStatus(request.getStatus());
        bookEntity.setPublish(format.parse(request.getPublish()));

        return bookRepository.save(bookEntity);
    }

    @Override
    public void lending(LendingCreateRequest request) throws ParseException {
        BookEntity bookEntity = bookRepository.findById(request.getBookId()).orElse(null);
        StudentEntity studentEntity = studentRepository.findById(request.getStudentId()).orElse(null);
        LendingEntity lendingEntity = new LendingEntity();
        lendingEntity.setBookEntity(bookEntity);
        lendingEntity.setStudentEntity(studentEntity);
        lendingEntity.setQuantity(request.getQuantity());
        lendingEntity.setCreateDate(format.parse(request.getCreateDate()));
        lendingEntity.setReturnDate(format.parse(request.getReturnDate()));
        BookAndStudentKey bookAndStudentKey = new BookAndStudentKey();
        bookAndStudentKey.setBookId(bookEntity.getId());
        bookAndStudentKey.setStudentId(bookEntity.getId());
        lendingEntity.setBookAndStudentKey(bookAndStudentKey);
        lendingRepository.save(lendingEntity);
    }

    @Override
    public void deleteLending(String bookId, String studentId) {
        LendingEntity lendingEntity = lendingRepository.findByBookAndStudentKey(bookId,studentId);
        if (lendingEntity!=null){
            lendingRepository.delete(lendingEntity);
        }

    }
}
