package com.cg.service;

import com.cg.entities.Employee;

public interface Employee_Service 
{
	//by default all the method are abstract in the Interface
	void addEmployee(Employee emp);//create
	void updateEmployee(Employee emp);//update
	Employee getEmployeeById(int ID);//Retrieve
	void removeEmployee(Employee emp);//delete

}