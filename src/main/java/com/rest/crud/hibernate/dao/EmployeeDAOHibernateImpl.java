package com.rest.crud.hibernate.dao;

import com.rest.crud.hibernate.entity.Employee;
import com.rest.crud.hibernate.entity.EmployeeDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

  private EntityManager entityManager;

  public EmployeeDAOHibernateImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  @Transactional
  public List<Employee> findAll() {

    Session session = entityManager.unwrap(Session.class);

    Query<Employee> query = session.createQuery("from Employee ", Employee.class);

    return query.getResultList();
  }
}
