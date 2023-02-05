package com.learn.crudop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="firstName", nullable = false)
    private String fname;
    @Column(name = "lastName")
    private String lname;
    @Column(name = "email")
    private String email;

}
