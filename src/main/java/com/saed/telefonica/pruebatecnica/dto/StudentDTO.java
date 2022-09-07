package com.saed.telefonica.pruebatecnica.dto;

import com.saed.telefonica.pruebatecnica.entity.License;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    @Min(value = 1, message = "El id debe ser mayor que 0")
    Long id;

    @NotBlank(message = "El campo nombre es requerido")
    String name;

    @NotBlank(message = "El campo edad es requerido")
    String age;

    @NotBlank(message = "El campo dni es requerido")
    String dni;

    License license;

}
