package com.saed.telefonica.pruebatecnica.repository;

import com.saed.telefonica.pruebatecnica.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IModuleRepo  extends JpaRepository<Module, Long> {
}
