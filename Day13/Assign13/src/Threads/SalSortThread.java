package Threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.app.core.Emp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SalSortThread extends Thread {
	private ArrayList<Emp> list;

	public SalSortThread(String name, ArrayList<Emp> list) {
		super(name);// NEW
		this.list = list;
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " started");
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FileBySal.txt"))) {
			out.writeObject(list);
		} catch (FileNotFoundException e1) {
			System.out.println("FileNotFoundException:Creating File");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}
}
