package com.saed.telefonica.pruebatecnica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ST_STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ST_ID")
    private Long id;

    @Column(name = "ST_NAME")
    private String name;

    @Column(name = "ST_AGE")
    private String age;

    @Column(name = "ST_DNI")
    private String dni;

    @ManyToOne
    @JoinColumn(name = "ST_LICENSE_FK")
    private License license;

}
