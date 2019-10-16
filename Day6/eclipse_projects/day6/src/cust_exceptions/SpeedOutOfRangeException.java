package cust_exceptions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String errMesg) {
		super(errMesg);
	}
}
