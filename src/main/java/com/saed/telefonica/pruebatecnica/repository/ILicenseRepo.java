package com.saed.telefonica.pruebatecnica.repository;

import com.saed.telefonica.pruebatecnica.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILicenseRepo extends JpaRepository<License, Long> {
}
