package tester;

import java.util.Scanner;
import java.util.ArrayList;
import com.app.core.Student;
import utils.ValidationUtils;
//import java.text.SimpleDateFormat;

public class Tester {

	public static void main(String[] args) {
		

	    //Menu
	    try(Scanner sc = new Scanner(System.in);){
	    boolean exit=false;
	    ArrayList<Student> s_al=new ArrayList<Student>();
	    while(!exit){
	    try {
	    	System.out.println("Menu");
	    	System.out.println("1. Register A new Student");
	    	System.out.println("2. Display All Student");
	    	System.out.println("0. Exit");
	    	System.out.print("Enter Choice:");
	    	
	    	switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter prn, name, email, course, marks, dob");
				Student temp=new Student(sc.next(),ValidationUtils.checkName(sc.next()),ValidationUtils.checkEmail(sc.next()),ValidationUtils.checkCourse(sc.next()),sc.nextInt(),ValidationUtils.checkDate(sc.next()));
				s_al.add(temp);
				System.out.println("New Student Registered");
				break;
			case 2:
				System.out.println("Displaying All Student");
				for (Student s : s_al)
					System.out.println(s);
				break;
			case 0:exit=true;
				System.out.println("Bye!");
				break;
			default:System.out.println("Invalid Choice");
				break;
				}
	    
	    	} catch(Exception e)
	    		{
	    		System.out.println(e.getMessage());
	    		}
	    }
	    
	    }
	    
		
//		
//		Date tempd=new Date();
//		CourseType c=CourseType.valueOf("DAI");
//		//SimpleDateFormat sdf=new SimpleDateFormat(tempd)
//		int TotalSeats=4;
//		
//		Student[] s= new Student[TotalSeats];
//		//String prn, String name, String email, String course, int marks
//		s[0]= new Student("dac-001","Rana","abc@gmail.com",c,90,tempd);
//		s[1]= new Student("dac-002","Raghav","pqr@gmail.com",c,95,tempd);
//	    s[2]= new Student("dac-003","Abhay","xyz@gmail.com",c,88,tempd);
//	   
//	    PrintStudents(s);
//	    
//	    
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter New Student Details:");
//			
//			System.out.println("Enter PRN");
//			String nprn=sc.next();
//			
//			System.out.println("Enter Name:");
//			String nname=sc.next();
//			ValidationUtils.checkName(nname);
//			
//			System.out.println("Enter Email:");
//			String nemail=sc.next();
//			ValidationUtils.checkEmail(nemail);
//			
//			System.out.println("Enter Course:");
//			CourseType ncourse=ValidationUtils.checkCourse(sc.next());
//			
//			System.out.println("Enter Marks");
//			int nmarks=sc.nextInt();
//			
//			System.out.println("Enter DOB as dd/MM/yyyy");
//			Date ndob=ValidationUtils.checkDate(sc.next());
//			
//			Student stemp= new Student(nprn,nname,nemail,ncourse,nmarks,ndob);
//			
//			boolean dup=false;
//			for(Student temp:s) {
//				if(temp!=null) {
//					if(temp.equals(stemp))
//						dup=true;
//				}
//			}
//			
//			if(dup)
//				System.out.println("Duplicate PRN Exists!!");
//			else {
//				s[3]= new Student(nprn,nname,nemail,ncourse,nmarks,ndob);
//				System.out.println("Student Added Successfully");
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		PrintStudents(s);
		
	}

//	private static void PrintStudents(Student s[]) {
//		//Printing Each Students
//		for(Student temp:s) {
//			if(temp!=null)
//				System.out.println(temp);
//		}
//
//	}
}
