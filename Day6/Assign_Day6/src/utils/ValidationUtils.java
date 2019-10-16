package utils;

import cust_excs.StudentHandlingException;

public class ValidationUtils {
	// add static constants fro speed lims
	public static final int MIN_LENGTH, MAX_LENGTH;
	static {
		MIN_LENGTH= 4;
		MAX_LENGTH= 10;
	}

//	public static void checkPrn(String nprn) throws StudentHandlingException {
//		if (nprn.equals("dac-101") || nprn.equals("dac-102") || nprn.equals("dac-103"))
//			throw new StudentHandlingException("SAME PRN EXISTS");
//		
//	}

	public static void checkName(String nname) throws StudentHandlingException {
		if (nname.length()<MIN_LENGTH || nname.length()>MAX_LENGTH)
			throw new StudentHandlingException("Invalid Name Length!!");
	}
	public static void checkEmail(String nemail) throws StudentHandlingException {
		if (nemail.length()<MIN_LENGTH || nemail.length()>MAX_LENGTH || !nemail.contains("@"))
			throw new StudentHandlingException("Invalid Email");
	}
	public static void checkCourse(String ncourse) throws StudentHandlingException {
		if (!(ncourse.equals("DAC") || ncourse.equals("DAI") || ncourse.equals("DMC") || ncourse.equals("DBDAC")))
			throw new StudentHandlingException("Invalid Course!");
	}
	// valid course names are -- dac/dmc/dbdac/dai
}
