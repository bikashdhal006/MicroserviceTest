package com.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.department.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long>{
	public Department findDepartmentByid(Long id);

}
