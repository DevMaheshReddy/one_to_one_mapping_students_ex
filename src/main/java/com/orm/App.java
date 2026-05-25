package com.orm;
import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.EmployeeDao;
import com.orm.entities.Employee;
import com.orm.entities.Laptop;
public class App {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	        EmployeeDao dao = context.getBean("dao", EmployeeDao.class);
	        
	        Laptop laptop1=new Laptop();
	        laptop1.setLaptop_id(2005);
	        laptop1.setBrand("Samsung");
	        
	        Laptop laptop2=new Laptop();
	        laptop2.setLaptop_id(2004);
	        laptop2.setBrand("MacBook");
	        
	        Employee emp1 =new Employee();
	        emp1.setEmp_id(9001);
	        emp1.setEmp_name("Veda");
	        emp1.setLaptop(laptop1);
	        
	        Employee emp2 =new Employee();
	        emp2.setEmp_id(9002);
	        emp2.setEmp_name("Sai");
	        emp2.setLaptop(laptop1);
	        
	        Employee emp3 =new Employee();
	        emp3.setEmp_id(9009);
	        emp3.setEmp_name("Lakshmi");
	        emp3.setLaptop(laptop2);
	        
	        Employee emp4 =new Employee();
	        emp4.setEmp_id(9007);
	        emp4.setEmp_name("Ravi");
	        emp4.setLaptop(laptop1);
	        
	        Employee emp5 =new Employee();
	        emp5.setEmp_id(9005);
	        emp5.setEmp_name("Prathi");
	        emp5.setLaptop(laptop2);
	        
	        ArrayList<Employee> list=new ArrayList<Employee>();
	        list.add(emp1);
	        list.add(emp2);
	        list.add(emp3);
	        list.add(emp4);
	        list.add(emp5);
	      
	        for (Employee emp : list) {
	            dao.insert(emp);
	        }
	}
}
