package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDao_Implementation implements EmployeeDao
{
	//we are going to use EntityManager method-CRUD
	private EntityManager em;
	
	//default constructor 
	public EmployeeDao_Implementation() {
		super();
		em=JPA_Util.getEntityManager();
	}

	@Override
	//to add=>persist(objname);
	public void addEmployee(Employee emp)
	{
		em.persist(emp);
		
	}

	@Override
	//to update=>merge(objname);
	public void updateEmployee(Employee emp) {
		em.merge(emp);
	}

	@Override
	//to reteive a data=>find(classname,pk);
	public Employee getEmployeeById(int ID) {
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	@Override
	//to remove=>remove(objname);
	public void removeEmployee(Employee emp) {
		em.remove(emp);
		
	}

	@Override
	//transaction method to start and close the Entity Manager
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

}