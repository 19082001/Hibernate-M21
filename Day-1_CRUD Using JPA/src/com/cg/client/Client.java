package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.Employee_Service;
import com.cg.service.Employee_Service_Implementation;

@SuppressWarnings("unused")

public class Client {

	public static void main(String[] args) {
		//Lazy initialization
		Employee_Service service=new Employee_Service_Implementation();
		Employee emp=new Employee();
		
		//create operation
		emp.setID(101);
		emp.setNAME("Snehal J");
		service.addEmployee(emp);
		
		//reteive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//update a data
		emp=service.getEmployeeById(101);
		emp.setNAME("Snehal Jarag");
		service.updateEmployee(emp);
		
		//retreive a data
		emp=service.getEmployeeById(101);
		System.out.println("Emp ID: "+emp.getID());
		System.out.println("Emp NAME: "+emp.getNAME());
		
		//delete a data
		emp=service.getEmployeeById(104);
		service.removeEmployee(emp);
		
		

	}

}