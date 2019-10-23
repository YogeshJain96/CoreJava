package bin_io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class TestSerial {

	public static void main(String[] args) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emps.ser"))) {
			// create empty HM to store emps
			HashMap<Integer, Emp> emps = new HashMap<>();
			// populate it
			emps.put(101, new Emp(101, "abc5", 1000));
			emps.put(10, new Emp(10, "abc7", 7000));
			//assign adr
			emps.get(101).linkAddress("pune", "4361436");
			emps.get(10).linkAddress("delhi", "658678");
			//display HM contents
			for(Emp e : emps.values())
				System.out.println(e);
			// save it using OOS
			out.writeObject(emps);
			System.out.println("data write over....");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
