package com.rest.crud.hibernate.controller;

import com.rest.crud.hibernate.entity.Employee;
import com.rest.crud.hibernate.entity.EmployeeDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired private EmployeeDAO employeeDAO;

  @GetMapping("/employees")
  public List<Employee> getEmployees() {
    return employeeDAO.findAll();
  }
}
