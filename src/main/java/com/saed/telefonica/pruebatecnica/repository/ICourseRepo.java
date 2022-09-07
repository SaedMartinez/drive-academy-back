package com.saed.telefonica.pruebatecnica.repository;

import com.saed.telefonica.pruebatecnica.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo  extends JpaRepository<Course, Long> {
}
