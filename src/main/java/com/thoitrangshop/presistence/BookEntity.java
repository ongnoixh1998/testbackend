package com.thoitrangshop.presistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
public class BookEntity {
    @Id
    String id;
    String name;
    String cat;
    Date publish;
    String author;
    String status;

    @OneToMany(mappedBy = "bookEntity")
    @JsonIgnore
    List<LendingEntity> lendingEntities;

}
