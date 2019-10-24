//1. Create new Student class in pkg "com.app.core" 
//It has --prn(String),name,email,marks,course
//Provide constructor & toString
//Student's identity is : prn no
//(Meaning 2 students are same iff their prn nos are same)
//Override equals method correctly.
//
//1.1 Create custom exception class
//StudentHandlingException , in cust_excs pkg , as a checked exception.
//
//1.2 Create a Tester class with main.
//Create Scanner , within  try-with-resources.
//
//Create hard-coded sample data with Student[] , with 3 students, with prns 
//dac-001,dac-002,dac-003 (Don't create it with dynamic array!!!)
//
//Prompt user , to accept new student's  details.
//If student with same prn already exists , throw custom exception(showing err mesg : dup prn!!!!) , otherwise--add the details in array & give success message.
//Display array contents , using for-each.
//
//2. After completing 1st part , add more validation rules
//(In utils packge, add a class ValidationRules & add static methods)
//2.1 student name must be min 4 chars & max 10 chars long
//(validateName method)
//
//2.2 student email must be min 4 chars & max 10 chars long & must contain @ char. (Hint : use contains method of String class)
//(validateEmail method)
//
//2.3 valid course names are -- dac/dmc/dbdac/dai
//Do proper exception handling & complete the assignment.
//(Hint : In tester , u must call all these validation rules , before admitting a new student)

package com.app.core;

import java.util.Date;

public class Student implements Comparable<Student> {
	private String prn, name, email;
	private CourseType course;
	private int marks;
	private Date dob;

	public Student(String prn) {
		super();
		this.prn = prn;
	}
	public Student(String prn, String name, String email, CourseType course, int marks,Date dob) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.course = course;
		this.marks = marks;
		this.dob=dob;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", course=" + course + ", marks=" + marks
				+ ", dob=" + dob + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
	//System.out.println("Checking equality");
	if(obj instanceof Student) {
		return (this.prn.equals(s.prn));
	}	
	else {
		return false;
	}	
	
    }
	
	public boolean setMarks(int newmarks) {
		this.marks=newmarks;
		return true;
	}
	public Date getDOB() {
		return this.dob;
	}
	public int getMarks() {
		return this.marks;
	}
	public String getCourse() {
		return this.course.toString();
	}
	// implementing N.O using compareTo
	@Override
	public int compareTo(Student Other) {
		// <0 , =0 , > 0
		System.out.println("N.O. compareTo");
		return prn.compareTo(Other.prn);
	}
}
	
