package com.saed.telefonica.pruebatecnica.repository;

import com.saed.telefonica.pruebatecnica.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IModuleRepo  extends JpaRepository<Module, Long> {

    List<Module> findByStudent_Id(Long id);
}
