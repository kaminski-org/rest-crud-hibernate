package com.rest.crud.hibernate.entity;

import java.util.List;

public interface EmployeeDAO {

  List<Employee> findAll();
}
