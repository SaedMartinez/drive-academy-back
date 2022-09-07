package com.saed.telefonica.pruebatecnica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "MD_MODULE")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MD_ID")
    private Long id;

    @Column(name = "MD_MODULE_NAME")
    private String moduleName;

    @Column(name = "MD_MODULE_STATUS")
    private String moduleStatus;

    @ManyToOne
    @JoinColumn(name = "MD_COURSE_FK")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "MD_STUDENT_FK")
    private Student student;
}
