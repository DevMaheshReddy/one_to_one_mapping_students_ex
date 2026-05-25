package com.orm.entities;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
public class Employee {
	
	@Id
	private int emp_id;
	private String emp_name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="laptop_id")
	private Laptop laptop;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Employee(int emp_id, String emp_name, Laptop laptop) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.laptop = laptop;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}

