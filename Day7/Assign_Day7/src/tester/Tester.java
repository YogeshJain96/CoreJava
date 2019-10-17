package tester;

import java.util.Scanner;
import java.util.Date;
import com.app.core.Student;
import com.app.core.CourseType;
import utils.ValidationUtils;
//import java.text.SimpleDateFormat;

public class Tester {

	public static void main(String[] args) {
		
		Date tempd=new Date();
		CourseType c=CourseType.valueOf("DAI");
		//SimpleDateFormat sdf=new SimpleDateFormat(tempd)
		int TotalSeats=4;
		Student[] s= new Student[TotalSeats];
		//String prn, String name, String email, String course, int marks
		s[0]= new Student("dac-001","Rana","abc@gmail.com",c,90,tempd);
		s[1]= new Student("dac-002","Raghav","pqr@gmail.com",c,95,tempd);
	    s[2]= new Student("dac-003","Abhay","xyz@gmail.com",c,88,tempd);
	   
	    PrintStudents(s);
	    
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter New Student Details:");
			
			System.out.println("Enter PRN");
			String nprn=sc.next();
			
			System.out.println("Enter Name:");
			String nname=sc.next();
			ValidationUtils.checkName(nname);
			
			System.out.println("Enter Email:");
			String nemail=sc.next();
			ValidationUtils.checkEmail(nemail);
			
			System.out.println("Enter Course:");
			CourseType ncourse=ValidationUtils.checkCourse(sc.next());
			
			System.out.println("Enter Marks");
			int nmarks=sc.nextInt();
			
			System.out.println("Enter DOB as dd/MM/yyyy");
			Date ndob=ValidationUtils.checkDate(sc.next());
			
			Student stemp= new Student(nprn,nname,nemail,ncourse,nmarks,ndob);
			
			boolean dup=false;
			for(Student temp:s) {
				if(temp!=null) {
					if(temp.equals(stemp))
						dup=true;
				}
			}
			
			if(dup)
				System.out.println("Duplicate PRN Exists!!");
			else {
				s[3]= new Student(nprn,nname,nemail,ncourse,nmarks,ndob);
				System.out.println("Student Added Successfully");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		PrintStudents(s);
		
	}

	private static void PrintStudents(Student s[]) {
		//Printing Each Students
		for(Student temp:s) {
			if(temp!=null)
				System.out.println(temp);
		}

	}
}
