package com.saed.telefonica.pruebatecnica.controller;

import com.saed.telefonica.pruebatecnica.dto.StudentDTO;
import com.saed.telefonica.pruebatecnica.model.StudentModel;
import com.saed.telefonica.pruebatecnica.service.IStudentServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private IStudentServ iStudentServ;

    @GetMapping("/all")
    public List<StudentModel> searchStudentsWithoutPagination(){
        return iStudentServ.searchAllStudents();
    }

    @GetMapping("/search/student")
    public StudentModel searchStudent(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "dni", required = false) String dni
    ){
        StudentModel foundStudent;
        if (id != null){
            foundStudent = iStudentServ.searchStudentById(id);
            return foundStudent;
        }
        if (name != null){
            foundStudent = iStudentServ.searchStudentByName(name);
            return foundStudent;
        }
        if (dni != null){
            // por implement
        }
        return null;
    }

    @PostMapping("/create/student")
    public Long createStudent(@Validated @RequestBody StudentDTO studentDTO){
        //TODO metohod validar input DTO
        return iStudentServ.createStudent(studentDTO);
    }


    @PutMapping("/update/student")
    public Long updateStudent(@Validated @RequestBody StudentDTO studentDTO){
        //TODO metohod validar input DTO
        return iStudentServ.updateStudent(studentDTO);
    }
}
