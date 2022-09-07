package com.saed.telefonica.pruebatecnica.model;

import com.saed.telefonica.pruebatecnica.entity.License;
import com.saed.telefonica.pruebatecnica.entity.Student;
import lombok.Data;

@Data
public class StudentModel {
    Long id;
    String name;
    String age;
    String dni;
    License license;

    public StudentModel(Student student){
        this.id = student.getId();
        this.name = student.getName();
        this.age = student.getAge();
        this.dni = student.getDni();
        this.license = student.getLicense();
    }

}
