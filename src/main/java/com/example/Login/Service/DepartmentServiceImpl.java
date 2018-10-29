package com.example.Login.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login.Entity.Department;
import com.example.Login.Repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl {
	@Autowired
	DepartmentRepository departmentRepository;

	public List<Department> getDepartment() {
		return departmentRepository.findAll();
	}

	public boolean addDepartment(Department department) {
		Department testDep = departmentRepository.save(department);
		if (testDep != null) {
			return true;
		}
		return false;
	}

	public boolean updateDepartment(Department department, Integer id) {
		Department testDep = departmentRepository.getOne(id);
		if (testDep.getDepId() != null) {
			department.setDepId(id);
			departmentRepository.save(department);
			return true;
		}
		return false;
	}

	public boolean deleteDepartment(Integer id) {
		departmentRepository.deleteById(id);
		return true;
	}

}
