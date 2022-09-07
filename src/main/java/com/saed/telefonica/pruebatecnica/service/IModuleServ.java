package com.saed.telefonica.pruebatecnica.service;

import com.saed.telefonica.pruebatecnica.model.ModuleModel;
import com.saed.telefonica.pruebatecnica.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IModuleServ {
    List<ModuleModel> searchModulesListByStudent(Long studentId);
}
