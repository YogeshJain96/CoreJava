package utils;

import com.app.core.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import com.app.core.CourseType;
import cust_excs.StudentHandlingException;
//import java.util.HashSet;

public class ValidationUtils {
	
	public static final int MIN_LENGTH, MAX_LENGTH;
	// SDF
	public static SimpleDateFormat sdf;
	public static Date endDate;
	static {

		MIN_LENGTH = 4;
		MAX_LENGTH = 10;
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			endDate = sdf.parse("01/01/1985");
		} catch (ParseException e) {
			System.out.println("err in static inin block" + e);
		}
	}

//	public static String checkPRN(String prn ,HashSet<Student> stu) throws StudentHandlingException {
//		if (stu.contains(new Student(prn)))
//			throw new StudentHandlingException("Duplicate Student");
//		return prn;
//	}
	public static String checkPRN(String prn, HashMap<String,Student> stuHM) throws StudentHandlingException {
		if (stuHM.containsKey(prn))
			throw new StudentHandlingException("Duplicate Student Exist!!");
		return prn;
	}
	public static Student getStudent(String prn, HashMap<String,Student> stuHM) throws StudentHandlingException {
		if (stuHM.containsKey(prn))
			return stuHM.get(prn);
		else
			throw new StudentHandlingException("Student Not Found !!");
		
	}
	public static String updateMarks(String prn,int newmarks, HashMap<String,Student> stuHM) throws StudentHandlingException {
		if (stuHM.containsKey(prn)) {
			Student temp=stuHM.get(prn);
			temp.setMarks(newmarks);
			}
		else
			throw new StudentHandlingException("Student Not Found !!");
		return "Marks Updated";
		
	}
	public static String removeStudent(String prn, HashMap<String,Student> stuHM) throws StudentHandlingException {
		if (stuHM.containsKey(prn))
			stuHM.remove(prn);
		else
			throw new StudentHandlingException("Student Not Found !!");
		
		return "Removed Successfully";
	}
	public static CourseType checkCourse(String type) throws IllegalArgumentException {
		return CourseType.valueOf(type.toUpperCase());
	}

	public static String checkName(String nname) throws StudentHandlingException {
		if (nname.length() < MIN_LENGTH || nname.length() > MAX_LENGTH)
			throw new StudentHandlingException("Invalid Name Length!!");
		return nname;
	}

	public static String checkEmail(String nemail) throws StudentHandlingException {
		if (nemail.length() < MIN_LENGTH || nemail.length() > MAX_LENGTH || !nemail.contains("@"))
			throw new StudentHandlingException("Invalid Email");
		return nemail;
	}

	public static Date checkDate(String ndob) throws ParseException, StudentHandlingException {
		// parsing from string --->Date
		Date d = sdf.parse(ndob);
		// validation rule : date must be after 1st Jan 1985
		if (d.before(endDate))
			throw new StudentHandlingException("Invalid date!! Date must be after 1st Jan 1985");
		return d;
	}
}
