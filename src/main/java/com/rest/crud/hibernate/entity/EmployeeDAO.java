package com.rest.crud.hibernate.entity;

import java.util.List;

public interface EmployeeDAO {

  List<Employee> findAll();

  Employee findById(int id);

  void save(Employee employee);

  void deleteEmployeeById(int id);
}
