package com.app.core;

import java.time.LocalDate;
import java.io.Serializable;

public class Emp implements Serializable {
	private String EmpId, Ename, DeptId, Dname;
	private int sal;
	private LocalDate hiredate;

	public Emp(String empId, String ename, String deptId, String dname, int sal) {
		super();
		EmpId = empId;
		Ename = ename;
		DeptId = deptId;
		Dname = dname;
		this.sal = sal;
		this.hiredate = LocalDate.now();
	}

	@Override
	public String toString() {
		return "Emp [EmpId=" + EmpId + ", Ename=" + Ename + ", DeptId=" + DeptId + ", Dname=" + Dname + ", sal=" + sal
				+ ", hiredate=" + hiredate + "]";
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

	public String getEname() {
		return Ename;
	}

	public LocalDate getHireDate() {
		return hiredate;
	}
}
