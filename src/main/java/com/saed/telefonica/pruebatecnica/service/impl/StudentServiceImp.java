package com.saed.telefonica.pruebatecnica.service.impl;

import com.saed.telefonica.pruebatecnica.converter.StudentConverter;
import com.saed.telefonica.pruebatecnica.dto.StudentDTO;
import com.saed.telefonica.pruebatecnica.entity.Student;
import com.saed.telefonica.pruebatecnica.model.StudentModel;
import com.saed.telefonica.pruebatecnica.repository.ICourseRepo;
import com.saed.telefonica.pruebatecnica.repository.ILicenseRepo;
import com.saed.telefonica.pruebatecnica.repository.IModuleRepo;
import com.saed.telefonica.pruebatecnica.repository.IStudentRepo;
import com.saed.telefonica.pruebatecnica.service.IStudentServ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImp implements IStudentServ {

    @Autowired
    private IStudentRepo iStudentRepo;

    @Autowired
    private IModuleRepo iModuleRepo;

    @Autowired
    private ILicenseRepo iLicenseRepo;

    @Autowired
    private ICourseRepo iCourseRepo;

    @Autowired
    private StudentConverter studentConverter;
    @Override
    public StudentModel searchStudentById(Long id) {
        var studentOptional = iStudentRepo.findById(id);
        var student = new Student();
        if (studentOptional.isPresent()){
            student = studentOptional.get();
        }
        return new StudentModel(student);
    }

    @Override
    public StudentModel searchStudentByName(String name) {
        return null;
    }

    @Override
    public List<StudentModel> searchStudentsListBySomething(String something) {
        return null;
    }

    @Override
    public List<StudentModel> searchAllStudents() {
        return studentConverter.listConverter(iStudentRepo.findAll());
    }

    @Override
    public Long createStudent(StudentDTO studentDTO) {
        var preparedStudentEntity = fillEntityStudent(studentDTO, new Student());
        preparedStudentEntity = iStudentRepo.save(preparedStudentEntity);
        return preparedStudentEntity.getId();
    }

    @Override
    public Long updateStudent(StudentDTO studentDTO) {
        //TODO implementar analisis cambio estado
        var studentEntity = iStudentRepo.findById(studentDTO.getId()).get();
        var preparedStudentEntity = fillEntityStudent(studentDTO, studentEntity);
        preparedStudentEntity = iStudentRepo.save(preparedStudentEntity);
        return preparedStudentEntity.getId();
    }

    Student fillEntityStudent(StudentDTO studentDTO, Student studentEntity){
        if (studentDTO.getId() != null) studentEntity.setId(studentDTO.getId());
        studentEntity.setName(studentDTO.getName());
        studentEntity.setDni(studentDTO.getDni());
        studentEntity.setAge(studentDTO.getAge());
        studentEntity.setLicense(studentDTO.getLicense());
        return studentEntity;
    }
}
