package com.saed.telefonica.pruebatecnica.model;

import com.saed.telefonica.pruebatecnica.entity.Course;
import com.saed.telefonica.pruebatecnica.entity.Module;
import com.saed.telefonica.pruebatecnica.entity.Student;
import lombok.Data;

@Data
public class ModuleModel {
    private Long id;
    private String moduleName;
    private String moduleStatus;
    private Course course;
    private Student student;

    public ModuleModel(Module module){
        this.id = module.getId();
        this.moduleName = module.getModuleName();
        this.moduleStatus = module.getModuleStatus();
        this.course = module.getCourse();
        this.student = module.getStudent();
    }
}
