package com.cg.classpertable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTable_Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		// Create one Employee
		Employee emp=new Employee();
		emp.setName("Gauri_1");
		emp.setSalary(25000);
		em.persist(emp);
		
		// Create 2nd Employee
		Employee emp1=new Employee();
		emp1.setName("Snehal");
		emp1.setSalary(95000);
		em.persist(emp1); // To add the row
		
		// Create one Manager
		Manager m=new Manager();
		m.setName("Tejas");
		m.setSalary(100000);
		m.setDeptName("Finance");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The Data is Added Successfully in the Database");
		em.close();
		factory.close();	
	}

}