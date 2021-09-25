package com.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.department.model.Department;
import com.department.model.User;
import com.department.service.DepartmentService;

@RestController
@RequestMapping("/department/")
public class Depcontroller {
	
	@Autowired
	DepartmentService departmentService;
	@RequestMapping(value="save", method = RequestMethod.POST)
	public Department saveDep(@RequestBody Department dept) {
		
		return departmentService.saveDepartment(dept);
	}
	
	@RequestMapping(value="getdept", method = RequestMethod.GET)
	public Department saveDep(@RequestParam ("id") Long deptid) {
		User u =new User();
		System.out.println(u.getMyvalue());
		System.out.println(u.getAge());
		
		return departmentService.getDepartmentById(deptid);
	}

}
