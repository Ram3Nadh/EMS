package com.employeemanagement.service;

import java.util.List;
import com.employeemanagement.entity.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> getAllDepartments();
    Department getDepartmentById(int id);
    boolean deleteDepartment(int id);
}
