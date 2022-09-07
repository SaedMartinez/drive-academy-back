package com.saed.telefonica.pruebatecnica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CS_COURSE")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CS_ID")
    private Long id;

    @Column(name = "CS_LEVEL")
    private String level;

}
