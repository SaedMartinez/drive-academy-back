package com.saed.telefonica.pruebatecnica.service;

import com.saed.telefonica.pruebatecnica.dto.StudentDTO;
import com.saed.telefonica.pruebatecnica.model.StudentModel;

import java.util.List;

public interface IStudentServ {

    StudentModel searchStudentById(Long id);
    StudentModel searchStudentByName(String name);
    List<StudentModel> searchStudentsListBySomething(String something);
    List<StudentModel> searchAllStudents();
    Long createStudent(StudentDTO studentDTO);
    Long updateStudent(StudentDTO studentDTO);
}
