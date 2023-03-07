package com.dailycodebuffer.SpringBoot.Controller;

import com.dailycodebuffer.SpringBoot.CustomeException.DepartmentNotFoundException;
import com.dailycodebuffer.SpringBoot.Service.DepartmentService;
import com.dailycodebuffer.SpringBoot.Entity.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;

    //slf4j Logger
    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
            logger.info("Inside Save Department of Department Controller");
            return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
            return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentByID(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        logger.info("Inside Fetch Department of Department Controller");
        return departmentService.fetchDepartmentListById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        logger.info("Inside Delete Department of Department Controller");
        departmentService.deleteDepartmentById(departmentId);
        return "Department Record Deleted Successfully!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        logger.info("Inside Update Department of Department Controller");
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        logger.info("Inside Fetch Department By ID of Department Controller");
        return departmentService.fetchDepartmentByName(departmentName);
    }
}
