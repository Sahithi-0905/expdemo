package com.deptcrudexp.expdemo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Department {
	
	@Id
	//@Generated(strategy=GenerationType.AUTO)
	private long departmentId; 
	private String departmentName;
	private String departmentCode;
	
//	public long getDepartmentId() {
//		return departmentId;
//	}
//	public void setDepartmentId(long departmentId) {
//		this.departmentId = departmentId;
//	}
//	public String getDepartmentName() {
//		return departmentName;
//	}
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//	public String getDepartmentCode() {
//		return departmentCode;
//	}
//	public void setDepartmentCode(String departmentCode) {
//		this.departmentCode = departmentCode;
//	}
//	
//	public Department(long departmentId, String departmentName, String departmentCode) {
//		super();
//		this.departmentId = departmentId;
//		this.departmentName = departmentName;
//		this.departmentCode = departmentCode;
//	}
//	
//	public Department() {
//	}
	
	
	

}
