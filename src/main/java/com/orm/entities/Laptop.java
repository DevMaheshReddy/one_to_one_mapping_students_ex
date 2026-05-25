package com.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Laptop {
	
	@Id
	private int laptop_id;
	private String brand;
	public int getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Laptop(int laptop_id, String brand) {
		super();
		this.laptop_id = laptop_id;
		this.brand = brand;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
