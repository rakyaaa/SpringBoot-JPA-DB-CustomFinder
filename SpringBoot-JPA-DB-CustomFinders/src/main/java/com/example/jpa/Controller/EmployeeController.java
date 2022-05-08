package com.example.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.Services.EmployeeService;
import com.example.jpa.entities.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	EmployeeService empser;
	
	@RequestMapping("/addEmployee")
	public List<Employee> addEmp(@RequestBody Employee emp) {
		return empser.addEmployee(emp);
	}
	
	@RequestMapping(value = "/listByName/{name}", method = RequestMethod.GET)
	public List<Employee> listByEmpName(@PathVariable String name) {
		System.out.println(empser.findEmployeeByName(name));
		return empser.findEmployeeByName(name);
	}
	
	@RequestMapping(value = "/listBySalary/{salary}", method = RequestMethod.GET)
	public List<Employee> listBySalary(@PathVariable int salary) {
		System.out.println(empser.findEmployeeBySalary(salary));
		return empser.findEmployeeBySalary(salary);
	}
	
	@RequestMapping(value = "/listByRole/{role}", method = RequestMethod.GET)
	public List<Employee> listByRole(@PathVariable String role) {
		System.out.println(empser.findEmployeeByRole(role));
		return empser.findEmployeeByRole(role);
	}
	
	@RequestMapping(value = "/listByDeptId/{deptId}", method = RequestMethod.GET)
	public List<Employee> listByDeptId(@PathVariable int deptId) {
		System.out.println(empser.findEmployeeByDeptId(deptId));
		return empser.findEmployeeByDeptId(deptId);
	}
}
