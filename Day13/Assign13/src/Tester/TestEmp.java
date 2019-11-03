/*2. Create a suitable data structure to store department wise employee details.
Populate it with 3 depts having 4 emps each(hard coded)
Create multi threaded application , to store emp data in a separate text file for separate department, 
sorted as per salary.*/
package Tester;

import java.util.ArrayList;
import java.util.HashMap;
import static Utils.CollectionUtils.*;
import com.app.core.Emp;

import Threads.*;

public class TestEmp {
	public static void main(String[] args) {
		HashMap<String, Emp> hm = new HashMap<>();
		hm = populate();
		System.out.println("Data Populated");
//		Printing Employees
//		hm.forEach((k, v) ->System.out.println(k+" : "+v));

		ArrayList<Emp> list = new ArrayList<Emp>(hm.values());
		SortByDept(list).forEach((v) ->System.out.println(v));
		SortBySal(list).forEach((v) ->System.out.println(v));

		System.out.println("Creating Threads...");

		DeptSortThread dt = new DeptSortThread("DeptSortThread", SortByDept(list));
		SalSortThread st = new SalSortThread("SalSortThread", SortBySal(list));
		dt.start();
		st.start();
		DispThread dispt = new DispThread("DispThread");
		dispt.start();
	}
}
