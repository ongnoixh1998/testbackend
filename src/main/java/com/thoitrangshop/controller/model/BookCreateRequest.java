package com.thoitrangshop.controller.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BookCreateRequest {
    String id;
    String name;
    String cat;
    String publish;
    String author;
    String status;
}
