package com.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.model.Department;
import com.department.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo departmentRepo;
	public Department getDepartmentById(Long id) {
		return departmentRepo.findDepartmentByid(id);
	}
	
	public Department saveDepartment(Department  dept) {
		return departmentRepo.save(dept);
		
	}

}
