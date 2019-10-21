package tester;

import java.util.Scanner;
import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.HashSet;
import com.app.core.Student;

import cust_excs.StudentHandlingException;
import utils.ValidationUtils;
//import java.text.SimpleDateFormat;

public class Tester {

	public static void main(String[] args) throws StudentHandlingException {
		
	    //Menu
	    try(Scanner sc = new Scanner(System.in);){
	    boolean exit=false;
	    //ArrayList<Student> s_al=new ArrayList<Student>();
	    //HashSet<Student> stu=new HashSet<>();
	    HashMap<String,Student> stuHM=new HashMap<>();
	    while(!exit){
	    try {
	    	System.out.println("Menu");
	    	System.out.println("1. Register A new Student");
	    	System.out.println("2. Display All Student");
	    	System.out.println("3. Find Student via PRN");
	    	System.out.println("4. Update Marks via PRN");
	    	System.out.println("5. Remove Student via PRN");	    	
	    	System.out.println("0. Exit");
	    	System.out.print("Enter Choice:");
	    	
	    	switch (sc.nextInt()) {
			case 1:
					System.out.println("Enter prn");
					String prn=sc.next();
					
					stuHM.put(ValidationUtils.checkPRN(prn,stuHM),new Student(prn));
							/*
							 * Student temp=new Student(ValidationUtils.checkPRN(sc.next(),stu));
							 * System.out.println("Enter prn, name, email, course, marks, dob(dd/mm/yyyy)");
							 * Student temp=new
							 * Student(ValidationUtils.checkPRN(sc.next(),stu),ValidationUtils.checkName(sc.
							 * next()),ValidationUtils.checkEmail(sc.next()),ValidationUtils.checkCourse(sc.
							 * next()),sc.nextInt(),ValidationUtils.checkDate(sc.next())); if(stu.add(temp))
							 * System.out.println("New Student Registered"); else
							 * System.out.println("Duplicate Student");
							 */
			
				break;
			case 2:
				System.out.println("Displaying All Student");
				for(Student s:stuHM.values())
					System.out.println(s);
				break;
			case 3:
				System.out.println("Enter PRN to View Details");
				System.out.println("Student Found: "+ValidationUtils.getStudent(sc.next(), stuHM));
				break;
			case 4:
				System.out.println("Enter PRN");
				String tprn=sc.next();
				System.out.println("Student Found: "+ValidationUtils.getStudent(tprn, stuHM));
				System.out.println("Enter New Marks");
				System.out.println(ValidationUtils.updateMarks(tprn,sc.nextInt(), stuHM));
				
				break;
			case 5:
				System.out.println("Enter PRN to Remove Student");
				System.out.println(ValidationUtils.removeStudent(sc.next(), stuHM));
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
	}
}
