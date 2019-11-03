package Threads;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import com.app.core.Emp;

public class DispThread extends Thread {
	public DispThread(String name) {
		super(name);
	}

	@Override
	public void run() // throws InterruptedException
	{

		ArrayList<Emp> tempAL = null;
		try {
			Thread.sleep(500);
			System.out.println("\n\n");
			System.out.println("/****** DE-SERIALIZATION ******/");
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("t1.txt"))) {
				tempAL = (ArrayList<Emp>) in.readObject();
			}
			System.out.println("FileByName");
			for (Emp e : tempAL)
				System.out.println(e);

			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("t2.txt"))) {
				tempAL = (ArrayList<Emp>) in.readObject();
			}
			
			System.out.println("\n");
			
			System.out.println("FileBySal");
			for (Emp e : tempAL)
				System.out.println(e);
			
			
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("t3.txt"))) {
				tempAL = (ArrayList<Emp>) in.readObject();
			}
			
			System.out.println("\n");
			
			System.out.println("FileByHiredate");
			for (Emp e : tempAL)
				System.out.println(e);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
