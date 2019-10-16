package tester;

import java.util.Scanner;
import com.app.core.Student;
import utils.ValidationUtils;

public class Tester {

	public static void main(String[] args) {
		
		int TotalSeats=4;
		Student[] s= new Student[TotalSeats];
		//String prn, String name, String email, String course, int marks
		s[0]= new Student("dac-001","Rana","abc@gmail.com","DAI",90);
		s[1]= new Student("dac-002","Raghav","pqr@gmail.com","DAC",95);
	    s[2]= new Student("dac-003","Abhay","xyz@gmail.com","DMC",88);
	   
	    PrintStudents(s);
	    
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter New Student Details:");
			System.out.println("Enter PRN");
			String nprn=sc.nextLine();
			//ValidationUtils.checkPrn(nprn);
			System.out.println("Enter Name:");
			String nname=sc.nextLine();
			ValidationUtils.checkName(nname);
			System.out.println("Enter Email:");
			String nemail=sc.nextLine();
			ValidationUtils.checkEmail(nemail);
			System.out.println("Enter Course:");
			String ncourse=sc.nextLine();
			ValidationUtils.checkCourse(ncourse);
			System.out.println("Enter Marks");
			int nmarks=sc.nextInt();
			Student stemp= new Student(nprn,nname,nemail,ncourse,nmarks);
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
				s[3]= new Student(nprn,nname,nemail,ncourse,nmarks);
				System.out.println("Student Added Successfully");
			}

			PrintStudents(s);
			
		} catch (Exception e) {
			System.out.println("Tester Catch");
			System.out.println(e.getMessage());
		}

	}

	private static void PrintStudents(Student s[]) {
		//Printing Each Students
		for(Student temp:s) {
			if(temp!=null)
				System.out.println(temp);
		}

	}
}
