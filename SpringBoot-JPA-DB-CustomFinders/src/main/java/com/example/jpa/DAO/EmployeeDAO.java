package com.example.jpa.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entities.Employee;

@Repository("empDao")
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
	//In this DAO , We specify the name of the function as findBy and then the actual name of the variable in the entiy class
	public List<Employee> findByempName(String name);
	public List<Employee> findBySalary(int salary);
	public List<Employee> findBydeptId(int deptId);
	public List<Employee> findByRole(String role);

}
