package com.saed.telefonica.pruebatecnica.repository;

import com.saed.telefonica.pruebatecnica.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Long> {
}
