package com.cg.jointinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR_Table_Joint_Inheritance")
public class Manager_Joint_Inheritance extends Employee_Joint_Inheritance 
{
	private static final long serialVersionUID=1L;
	private String deptName;
	// Getters and Setters Method 
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setSalary(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}