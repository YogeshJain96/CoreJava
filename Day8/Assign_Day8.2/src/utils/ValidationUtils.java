package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.core.CourseType;
//import java.text.SimpleDateFormat;
import cust_excs.StudentHandlingException;

public class ValidationUtils {
	// add static constants fro speed lims
	public static final int MIN_LENGTH, MAX_LENGTH;
	// SDF
		public static SimpleDateFormat sdf;
		public static Date endDate;
		static {

			MIN_LENGTH= 4;
			MAX_LENGTH= 10;
			sdf = new SimpleDateFormat("dd/MM/yyyy");
			try {
				endDate = sdf.parse("01/01/1985");
			} catch (ParseException e) {
				System.out.println("err in static inin block" + e);
			}
	}

	public static CourseType checkCourse(String type) throws IllegalArgumentException {
			return CourseType.valueOf(type.toUpperCase());
	}

	public static String checkName(String nname) throws StudentHandlingException {
		if (nname.length()<MIN_LENGTH || nname.length()>MAX_LENGTH)
			throw new StudentHandlingException("Invalid Name Length!!");
		return nname;
	}
	public static String checkEmail(String nemail) throws StudentHandlingException {
		if (nemail.length()<MIN_LENGTH || nemail.length()>MAX_LENGTH || !nemail.contains("@"))
			throw new StudentHandlingException("Invalid Email");
		return nemail;
	}
	
	public static Date checkDate(String ndob) throws ParseException,StudentHandlingException{
		// parsing from string --->Date
				Date d = sdf.parse(ndob);
				// validation rule : date must be after 1st Jan 1985
				if (d.before(endDate))
					throw new StudentHandlingException("Invalid date!! Date must be after 1st Jan 1985");
				return d;
	}
}
