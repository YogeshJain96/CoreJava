package Threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.app.core.Emp;
import java.util.ArrayList;
import static Utils.CollectionUtils.SortByHiredate;

public class HiredateThread extends Thread {
	private ArrayList<Emp> list;
	private String fname;
	public HiredateThread(String name, ArrayList<Emp> tlist,String fname) {
		super(name);
		this.list = SortByHiredate(tlist);
		this.fname=fname;
		
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " started");
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fname))) {
			out.writeObject(this.list);
		} catch (FileNotFoundException e1) {
			System.out.println("FileNotFoundException:Creating File");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}
}
