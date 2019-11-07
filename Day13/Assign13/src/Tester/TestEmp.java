/*2. Create a suitable data structure to store department wise employee details.
Populate it with 3 depts having 4 emps each(hard coded)
Create multi threaded application , to store emp data in a separate text file for separate department, 
sorted as per salary.*/
package Tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static Utils.CollectionUtils.*;
import com.app.core.Emp;

import Threads.*;

public class TestEmp {
	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, Emp> hm = new HashMap<>();
		hm = populate();
		System.out.println("Data Populated");
//		Printing Employees
//		hm.forEach((k, v) ->System.out.println(k+" : "+v));

		ArrayList<Emp> alist = new ArrayList<Emp>(hm.values());
		// SortByDept(list).forEach((v) ->System.out.println(v));
		// SortBySal(list).forEach((v) ->System.out.println(v));
		// SortByDept(list);
		int n = 3;// no. of dept
		
		//Creating Array Of List
		ArrayList<Emp>[] list = new ArrayList[n];
		//Intilaizing Array of List
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<Emp>();
		}
		for (Emp e : alist) {
			if (e.getDeptId().equals("111"))
				list[0].add(e);
			if (e.getDeptId().equals("222"))
				list[1].add(e);
			if (e.getDeptId().equals("333"))
				list[2].add(e);
		}
		System.out.println("Creating Threads...");
		DeptSalSortThread dt[] = new DeptSalSortThread[n];
		for (int i = 0; i < n; i++) {
			dt[i] = new DeptSalSortThread(i + "DeptThread", list[i], "FileDept"+i);
		}
		//Starting Threads
		for (int i = 0; i < n; i++) {
			dt[i].start();
		}
		
		//Printing Written Files
		for (int i = 0; i < n; i++) {
		Scanner sc = new Scanner(new File("FileDept"+i));
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		}
		
	}
}
