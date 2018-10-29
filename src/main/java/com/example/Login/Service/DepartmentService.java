package com.example.Login.Service;

import java.util.List;

import com.example.Login.Entity.Department;

public interface DepartmentService {
	List<Department> getAllDeparment();
	boolean addDepartment(Department department);
	boolean updateDepartment(Department department, Integer id);
	boolean deleteDepartment(Integer id);

}
