package com.cg.jointinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Joint_Inheritance_Test {
	

		public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em=factory.createEntityManager();
			em.getTransaction().begin();
			
			// Create one Employee
			Employee_Joint_Inheritance  emp6=new Employee_Joint_Inheritance ();
			emp6.setName("G");
			emp6.setSalary(15000);
			em.persist(emp6);
			
			// Create 2nd Employee
			Employee_Joint_Inheritance  emp7=new Employee_Joint_Inheritance ();
			emp7.setName("S");
			emp7.setSalary(95000);
			em.persist(emp7); // To add the row
			
			// Create one Manager
			Manager_Joint_Inheritance m2=new Manager_Joint_Inheritance();
			m2.setName("Snehal");
			m2.setSalary(100000);
			m2.setDeptName("IT");
			em.persist(m2);
			
			em.getTransaction().commit();
			System.out.println("The Data is Added Successfully in the Database");
			em.close();
			factory.close();	
		}

	
}
