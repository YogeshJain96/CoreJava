package day12_deserial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeSerialization {

	public static void main(String[] args) {
		// display restored emp details
		// chain of strms for de-serial

		try (ObjectInputStream in = new ObjectInputStream
				(new FileInputStream("emps.ser"))) {
			System.out.println(in.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
