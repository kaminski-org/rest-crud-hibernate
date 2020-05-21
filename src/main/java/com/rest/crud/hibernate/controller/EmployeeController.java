package com.rest.crud.hibernate.controller;

import com.rest.crud.hibernate.entity.Employee;
import com.rest.crud.hibernate.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

  @Autowired private EmployeeService employeeService;

  @GetMapping("/employees")
  public List<Employee> getEmployees() {
    return employeeService.findAll();
  }

  @GetMapping("/employees/{id}")
  public Employee getEmployee(@PathVariable int id) {
    return employeeService.findById(id);
  }

  @PostMapping("/employees")
  public void saveEmployee(@RequestBody Employee employee) {
    employeeService.save(employee);
  }

  @PutMapping("/employees")
  public void updateEmployee(@RequestBody Employee employee) {
    employeeService.save(employee);
  }

  @DeleteMapping("/employees/{id}")
  public void deleteEmployeee(@PathVariable int id) {
    employeeService.deleteEmployeeById(id);
  }
}
