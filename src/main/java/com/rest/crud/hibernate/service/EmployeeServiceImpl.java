package com.rest.crud.hibernate.service;

import com.rest.crud.hibernate.entity.Employee;
import com.rest.crud.hibernate.entity.EmployeeDAO;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired private EmployeeDAO employeeDAO;

  @Override
  @Transactional
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }

  @Override
  @Transactional
  public Employee findById(int id) {
    return employeeDAO.findById(id);
  }

  @Override
  @Transactional
  public void save(Employee employee) {
    employeeDAO.save(employee);
  }

  @Override
  @Transactional
  public void deleteEmployeeById(int id) {
    employeeDAO.deleteEmployeeById(id);
  }
}
