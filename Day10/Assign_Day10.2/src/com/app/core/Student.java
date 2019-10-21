package com.app.core;

import java.util.Date;

public class Student {
	private String prn, name, email;
	private CourseType course;
	private int marks;
	private Date dob;

	public Student(String prn) {
		super();
		this.prn = prn;
	}
	public Student(String prn, String name, String email, CourseType course, int marks, Date dob) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.course = course;
		this.marks = marks;
		this.dob = dob;
	}
	public void setMarks(int newmarks) {
		this.marks = newmarks;
	}
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", course=" + course + ", marks=" + marks
				+ ", dob=" + dob + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("In stu hashcode");
		return this.prn.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (obj instanceof Student) {
			return (this.prn.equals(s.prn));
		} else {
			return false;
		}

	}

}
