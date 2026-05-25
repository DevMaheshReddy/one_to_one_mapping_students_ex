package com.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entities.Employee;

public class EmployeeDao {
	HibernateTemplate hibernateTemplate;
	@Transactional
	public void insert(Employee employee) {
		hibernateTemplate.save(employee);
		System.out.println("Inserted");
		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public EmployeeDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	public EmployeeDao() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
