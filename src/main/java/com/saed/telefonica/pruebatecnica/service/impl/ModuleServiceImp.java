package com.saed.telefonica.pruebatecnica.service.impl;

import com.saed.telefonica.pruebatecnica.model.ModuleModel;
import com.saed.telefonica.pruebatecnica.repository.IModuleRepo;
import com.saed.telefonica.pruebatecnica.service.IModuleServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleServiceImp implements IModuleServ {

    @Autowired
    private IModuleRepo iModuleRepo;

    @Override
    public List<ModuleModel> searchModulesListByStudent(Long studentId) {
        var moduleModelList = new ArrayList<ModuleModel>();
        var modulesList =  iModuleRepo.findByStudent_Id(studentId);
        modulesList.forEach( module -> moduleModelList.add(new ModuleModel(module)));
        return moduleModelList;
    }
}
