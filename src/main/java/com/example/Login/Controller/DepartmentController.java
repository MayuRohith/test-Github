package com.example.Login.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Login.Entity.Department;
import com.example.Login.Service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/department")
	public List<Department> getDepartment() {
		return departmentService.getAllDeparment();
	}

	@PostMapping("/department")
	public HttpStatus postDep(@RequestBody Department department) {
		boolean testDepo = departmentService.addDepartment(department);
		if (testDepo) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@PutMapping("/department/{id}")
	public HttpStatus putDepartment(@RequestBody Department department, @PathVariable Integer id) {
		boolean testDep = departmentService.updateDepartment(department, id);
		if (testDep) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

	@DeleteMapping("/department/{id}")
	public HttpStatus delDeaprtment(@PathVariable Integer id) {
		boolean testDep = departmentService.deleteDepartment(id);
		if (testDep) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
}
