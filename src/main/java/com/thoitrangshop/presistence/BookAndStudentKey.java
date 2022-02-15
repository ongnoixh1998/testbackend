package com.thoitrangshop.presistence;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class BookAndStudentKey implements Serializable {
    String bookId;
    String studentId;
}
