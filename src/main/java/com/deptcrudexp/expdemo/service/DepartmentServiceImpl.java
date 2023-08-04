package com.deptcrudexp.expdemo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deptcrudexp.expdemo.entity.Department;
import com.deptcrudexp.expdemo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
		
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		Department depDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName())&&
		!"".equalsIgnoreCase(department.getDepartmentName())) {
			depDB.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDepartmentCode())&&
				!"".equalsIgnoreCase(department.getDepartmentCode())) {
					depDB.setDepartmentCode(department.getDepartmentCode());
				}
		return departmentRepository.save(depDB);
	}

	@Override
	public Department fetchDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}


	@Override
	public List<Department> getDepartmentByNameUsingjpql(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.getDepartmentByNameUsingjpql(departmentName);
	}
	
	
	@Override
	public List<Department> getDepartmentByCodeUsingjpql(String departmentCode) {
		// TODO Auto-generated method stub
		return departmentRepository.getDepartmentByCodeUsingjpql(departmentCode );
	}
	

}
