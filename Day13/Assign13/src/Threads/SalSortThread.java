package Threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.app.core.Emp;
import java.util.ArrayList;
import static Utils.CollectionUtils.SortBySal;

public class SalSortThread extends Thread {
	private ArrayList<Emp> list=new ArrayList<>();

	public SalSortThread(String name, ArrayList<Emp> tlist) {
		super(name);// NEW
		this.list = SortBySal(tlist);
		
	}

	@Override
	public void run() // throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName() + " started");
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FileBySal.txt"))) {
			out.writeObject(this.list);
		} catch (FileNotFoundException e1) {
			System.out.println("FileNotFoundException:Creating File");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}
}
