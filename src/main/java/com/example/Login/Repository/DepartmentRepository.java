package com.example.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Login.Entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
