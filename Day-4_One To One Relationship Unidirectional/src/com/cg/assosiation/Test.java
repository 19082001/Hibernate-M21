package com.cg.assosiation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Address dept=new Address();
		dept.setId(1);
		dept.setName("Sales");
		
		Address dept1=new Address();
		dept1.setId(2);
		dept1.setName("Finance");
		
		Employee e1=new Employee();
		e1.setName("Snehal");
		e1.setSalary(85000);
		e1.setDept(dept1);
		
		Employee e2=new Employee();
		e2.setName("Gauri");
		e2.setSalary(55000);
		e2.setDept(dept);
		
		em.persist(e1);
		em.persist(e2);
		
		System.out.println("Added employees with department");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}