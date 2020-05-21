package com.rest.crud.hibernate.service;

import com.rest.crud.hibernate.entity.Employee;
import java.util.List;

public interface EmployeeService {

  List<Employee> findAll();

  Employee findById(int id);

  void save(Employee employee);

  void deleteEmployeeById(int id);
}
