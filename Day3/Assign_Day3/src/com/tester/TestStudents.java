// Create java application for the following.
// Create Student class in a package "com.cdac.core" 
// 2.1 Every student must have   --- id(int) --if possible system generated(clue : use static id counter), name (String), email(String), age(int), gpa (double)

// 2.2 Add suitable parameterized constructor.
// Don't accept gpa in constructor , since it has to be computed.

// 2.3 Add a method getDetails to  fetch complete student details
// (ret type -- String)

// 2.4  Add computeGPA method in Student class
// Accept 3 scores for quiz , test & assignments
// GPA should be computed on 20 % of quiz score, 50% of test score & 30% of assignment score.

// 3 Write a TestStudents class in "com.tester" package

// Accept how many students to enroll in the class ,  from user.

//  Accept student details(w/o gpa) , using loop.
// Accept student scores & compute GPAs , using loop
// Display name of student having highest GPA.

package com.tester;
import com.cdac.core.Student;
import java.util.Scanner;

class TestStudents{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many students to enroll in the class : ");
	
	//Declaring Student Objects
	Student[] stu=new Student[sc.nextInt()];

	//Defining Student Objects(array) Details via User
	for(int i=0;i<stu.length;i++)
	{
		System.out.println("Enter Name, Email, Age");
		stu[i]=new Student(sc.next(),sc.next(),sc.nextInt());
	}

	for(int i=0;i<stu.length;i++)
	{
		System.out.println("Enter Quiz,Test,Assignment Marks:");
		System.out.println("GPA="+stu[i].computeGPA(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}
	
	//Printing Details
	for(int i=0;i<stu.length;i++)
	{
		System.out.println(stu[i].getDetails());
	}

	//Calculating Highest GPA
	double maxGPA=stu[0].getGPA();
	int maxIndex=0;
	for(int i=0;i<stu.length;i++)
	{
		if(stu[i].getGPA()>maxGPA){
			maxIndex=i;
			maxGPA=stu[i].getGPA();
		}
	}

	//Displaying Highest GPA	
	System.out.println("Student Having Max GPA : ");
	System.out.println(stu[maxIndex].getDetails());

	}
}