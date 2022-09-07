package com.saed.telefonica.pruebatecnica.dto;

import com.saed.telefonica.pruebatecnica.entity.License;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    Long id;
    String name;
    String age;
    String dni;
    License license;

}
