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
@Table(name = "student")
@Getter
@Setter
public class StudentEntity {
    @Id
    String id;
    String name;
    Date dateOfBirth;
    String sex;
    @OneToMany(mappedBy = "studentEntity")
    @JsonIgnore
    List<LendingEntity> lendingEntities;

}
