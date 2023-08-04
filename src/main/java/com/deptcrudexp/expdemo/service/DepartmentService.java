package com.deptcrudexp.expdemo.service;

import java.util.List;

import com.deptcrudexp.expdemo.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Department department, Long departmentId);

	public Department fetchDepartmentByName(String departmentName);



	public List<Department> getDepartmentByNameUsingjpql(String departmentName);

	public List<Department> getDepartmentByCodeUsingjpql(String departmentCode);
		
	
	

}
