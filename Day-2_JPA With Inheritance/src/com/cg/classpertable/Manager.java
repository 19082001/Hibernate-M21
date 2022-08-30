package com.cg.classpertable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_TABLE_1")

public class Manager extends Employee 
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
	
	
	
	
	
	
	
	
	
}