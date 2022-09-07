package com.saed.telefonica.pruebatecnica.converter;

import com.saed.telefonica.pruebatecnica.entity.Student;
import com.saed.telefonica.pruebatecnica.model.StudentModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("studentConverter")
public class StudentConverter {

     public List<StudentModel> listConverter(List<Student> studentList){
         List<StudentModel> studentModelList = new ArrayList<>();
         studentList.forEach( student -> studentModelList.add(new StudentModel(student)));
         return  studentModelList;
     }
}
