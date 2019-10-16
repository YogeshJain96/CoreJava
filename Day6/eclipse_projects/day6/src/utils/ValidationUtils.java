package utils;

import cust_exceptions.SpeedOutOfRangeException;

public class ValidationUtils {
	// add static constants fro speed lims
	public static final int MIN_SPEED, MAX_SPEED;
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}

	public static void checkSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("U r driving too slow!!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("U r driving too fast!!!!");
		System.out.println("Speed withing range....");
	}

}
