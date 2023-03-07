package com.dailycodebuffer.SpringBoot.Service;

import com.dailycodebuffer.SpringBoot.CustomeException.DepartmentNotFoundException;
import com.dailycodebuffer.SpringBoot.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


    Department fetchDepartmentListById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
