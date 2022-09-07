package com.saed.telefonica.pruebatecnica.controller;

import com.saed.telefonica.pruebatecnica.model.ModuleModel;
import com.saed.telefonica.pruebatecnica.model.StudentModel;
import com.saed.telefonica.pruebatecnica.service.IModuleServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/modules")
@CrossOrigin(origins = "*")
public class ModuleController {

    @Autowired
    private IModuleServ iModuleServ;


    @GetMapping("/search/byStudent")
    public List<ModuleModel> searchStudent(
            @RequestParam(value = "studentId", required = true) Long id
    ){
        List<ModuleModel> moduleModelList = new ArrayList<>();
        if (id != null){
            //TODO validacion input
            moduleModelList = iModuleServ.searchModulesListByStudent(id);
        }
        return moduleModelList;
    }
}
