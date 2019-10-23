package day12_deserial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

import bin_io.Emp;

public class TestDeSerialization2 {

	public static void main(String[] args) {
		// display restored emp details
		// chain of strms for de-serial

		try (ObjectInputStream in = new ObjectInputStream
				(new FileInputStream("emps.ser"))) {
			HashMap<Integer, Emp> hm=(HashMap<Integer, Emp>)in.readObject();
		   for(Emp e : hm.values())
			   System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
