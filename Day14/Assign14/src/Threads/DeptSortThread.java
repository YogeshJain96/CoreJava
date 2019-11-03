package Threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.app.core.Emp;
import java.util.ArrayList;
import static Utils.CollectionUtils.SortByDept;

public class DeptSortThread extends Thread {
	private ArrayList<Emp> list=new ArrayList<>();;
	
	public DeptSortThread(String name, ArrayList<Emp> templist) {
		super(name);// NEW
		this.list = SortByDept(templist);
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " started");
		//System.out.println(list);
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FileByDept.txt"))) {
			out.writeObject(this.list);
		} catch (FileNotFoundException e1) {
			System.out.println("FileNotFoundException:Creating File");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}
}
