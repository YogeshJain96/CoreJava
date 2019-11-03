/*2. Create a suitable data structure to store department wise employee details.
Populate it with 3 depts having 4 emps each(hard coded)
Create multi threaded application , to store emp data in a separate text file for separate department, 
sorted as per salary.*/

package com.app.core;

import java.io.Serializable;

public class Emp implements Serializable {
	private String EmpId,Ename,DeptId,Dname;
	private int sal;

	public Emp(String empId, String ename, String deptId, String dname, int sal) {
		super();
		EmpId = empId;
		Ename = ename;
		DeptId = deptId;
		Dname = dname;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", Ename=" + Ename + ", DeptId=" + DeptId + ", Dname=" + Dname + ", sal=" + sal
				+ "]";
	}

	public String getEmpId() {
		return EmpId;
	}
	public String getDeptId() {
		return DeptId;
	}
	public int getSal() {
		return sal;
	}
}
