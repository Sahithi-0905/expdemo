package com.deptcrudexp.expdemo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.deptcrudexp.expdemo.entity.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	@Query("select d from Department d where d.departmentName = ?1")
	public Department findByDepartmentName(String departmentName);
	
	
	@Query("SELECT d FROM Department d where d.departmentName =:a ")
	public List<Department> getDepartmentByNameUsingjpql(@Param("a")String departmentName);
	
	
	@Query("SELECT d.departmentName FROM Department AS d where d.departmentCode =:a ")
	public List<Department> getDepartmentByCodeUsingjpql(@Param("a")String departmentCode);
	
	 //public Department findByName();
	//SELECT c.name FROM Country c WHERE c.population > 1000000 ORDER BY c.name
		//@Query("Select Department order by departmentCode  ")
		//public Department fetchDepartmentByNameOrder(String departmentName);

}
