package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritance_Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		// Create one Employee
		Employee emp=new Employee();
		emp.setName("Gauri");
		emp.setSalary(38000);
		em.persist(emp);
		
		// Create 2nd Employee
		Employee emp1=new Employee();
		emp1.setName("Snehal");
		emp1.setSalary(85000);
		em.persist(emp1); // To add the row
		
		// Create one Manager
		Manager m=new Manager();
		m.setName("Tejas");
		m.setSalary(500000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The Data is Added Successfully in the Database");
		em.close();
		factory.close();	
	}

}