package com.thoitrangshop.controller.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LendingCreateRequest {
    String bookId;
    String studentId;
    Integer quantity;
    String createDate;
    String returnDate;
}
