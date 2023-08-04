package com.deptcrudexp.expdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deptcrudexp.expdemo.entity.Department;
import com.deptcrudexp.expdemo.service.DepartmentService;


@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")        //save data
	public Department saveDepartment(@RequestBody Department department){
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")        //get data
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/departments/{id}")  //find by id
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
		return departmentService.fetchDepartmentById(departmentId);
		
	}
	
	@DeleteMapping("/departments/{id}")   //delete by id
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "successfully deleted";
	}
	
	@PutMapping("/departments/{id}")    //updating dep
	public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department) {
		return departmentService.updateDepartment(department,departmentId);
	}
	
	@GetMapping("/departments/name/{name}")  //find by id
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
		return departmentService.fetchDepartmentByName(departmentName);
	}
	
	
	@GetMapping("/departments/byname/{name}")  //show dep by name
	public List<Department> getDepartmentByNameUsingjpql(@PathVariable("name") String departmentName){
		return departmentService.getDepartmentByNameUsingjpql(departmentName);
	}
	
	
	@GetMapping("/departments/bycode/{code}")  //show dep by name
	public List<Department> getDepartmentByCodeUsingjpql(@PathVariable("code") String departmentCode,String departmentName){
		return departmentService.getDepartmentByCodeUsingjpql(departmentCode);
	}
}






