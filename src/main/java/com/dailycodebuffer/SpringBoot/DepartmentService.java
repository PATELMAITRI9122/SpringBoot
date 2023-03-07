package com.dailycodebuffer.SpringBoot;

import com.dailycodebuffer.SpringBoot.DepartmentNotFoundException;
import com.dailycodebuffer.SpringBoot.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


    Department fetchDepartmentListById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
