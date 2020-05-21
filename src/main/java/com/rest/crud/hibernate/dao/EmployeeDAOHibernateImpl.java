package com.rest.crud.hibernate.dao;

import com.rest.crud.hibernate.entity.Employee;
import com.rest.crud.hibernate.entity.EmployeeDAO;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

  private final EntityManager entityManager;

  public EmployeeDAOHibernateImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Employee> findAll() {

    Session session = entityManager.unwrap(Session.class);

    Query<Employee> query = session.createQuery("from Employee ", Employee.class);

    return query.getResultList();
  }

  @Override
  public Employee findById(int id) {

    Session session = entityManager.unwrap(Session.class);

    Employee employee = session.get(Employee.class, id);

    return employee;
  }

  @Override
  public void save(Employee employee) {

    Session session = entityManager.unwrap(Session.class);

    session.saveOrUpdate(employee);
  }

  @Override
  public void deleteEmployeeById(int id) {

    Session session = entityManager.unwrap(Session.class);

    Query<Employee> query = session.createQuery("delete from Employee where id=:id");

    query.setParameter("id", id);

    query.executeUpdate();
  }
}
