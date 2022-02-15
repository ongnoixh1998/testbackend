package com.thoitrangshop.presistence;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lending")
@Getter
@Setter
public class LendingEntity {
    @EmbeddedId
    BookAndStudentKey bookAndStudentKey;
    @ManyToOne()
    @MapsId("bookId")
    BookEntity bookEntity;
    @ManyToOne()
    @MapsId("studentId")
    StudentEntity studentEntity;
    Integer quantity;
    Date createDate;
    Date returnDate;

}
