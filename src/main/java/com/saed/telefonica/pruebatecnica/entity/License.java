package com.saed.telefonica.pruebatecnica.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "LC_LICENSE")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LC_ID")
    private Long id;

    @Column(name = "LC_TYPE_NAME")
    private String typeName;
}
