package Threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import com.app.core.Emp;
import java.util.ArrayList;
import static Utils.CollectionUtils.SortBySal;
/*import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;*/

public class DeptSalSortThread extends Thread {
	private ArrayList<Emp> list=new ArrayList<>();;
	private String fname;
	public DeptSalSortThread(String name, ArrayList<Emp> templist,String fname) {
		super(name);// NEW
		this.list =templist;
		this.fname=fname;
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " started");
		//System.out.println(list);
		PrintWriter writer1;
		SortBySal(list);
		try {
			writer1 = new PrintWriter(new File(fname));
			  for(Emp e:list)
					writer1.write(e.toString()+"\n");
			writer1.flush();
			writer1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		/*
		 * try (ObjectOutputStream out = new ObjectOutputStream(new
		 * FileOutputStream("FileByDept.txt"))) { out.writeObject(this.list); } catch
		 * (FileNotFoundException e1) {
		 * System.out.println("FileNotFoundException:Creating File"); } catch
		 * (IOException e1) { e1.printStackTrace(); }
		 */
		System.out.println(Thread.currentThread().getName() + " over");

	}
}
