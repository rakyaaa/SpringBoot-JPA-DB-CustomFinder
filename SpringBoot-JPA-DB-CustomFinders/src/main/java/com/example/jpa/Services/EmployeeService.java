package com.example.jpa.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.jpa.DAO.EmployeeDAO;
import com.example.jpa.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO empdao;

	public List<Employee> addEmployee(Employee emp) {
		empdao.saveAndFlush(emp);
		return empdao.findAll();
	}
	
	public List<Employee> findEmployeeByName(String name){
		return empdao.findByempName(name);	
	}

	public List<Employee> findEmployeeByDeptId(int deptId){
		return empdao.findBydeptId(deptId);	
	}
	

	public List<Employee> findEmployeeBySalary(int salary){
		return empdao.findBySalary(salary);	
	}

	public List<Employee> findEmployeeByRole(String role){
		return empdao.findByRole(role);	
	}
	
}
