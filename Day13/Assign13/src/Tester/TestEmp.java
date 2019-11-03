/*2. Create a suitable data structure to store department wise employee details.
Populate it with 3 depts having 4 emps each(hard coded)
Create multi threaded application , to store emp data in a separate text file for separate department, 
sorted as per salary.*/
package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import static Utils.PopulateUtils.populate;
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

		System.out.println("Creating Threads...");
		// Sorting HM as per Department ID
		Collections.sort(list, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return ((String) o1.getDeptId()).compareTo(o2.getDeptId());
			}
		});
		DeptSortThread dt = new DeptSortThread("DeptSortThread", list);
		// Sorting as per Salary
				Collections.sort(list, new Comparator<Emp>() {
					@Override
					public int compare(Emp o1, Emp o2) {
						return ((Integer) o1.getSal()).compareTo(o2.getSal());
					}
				});
		SalSortThread st = new SalSortThread("SalSortThread", list);
		dt.start();
		st.start();
		DispThread dispt = new DispThread("DispThread");
		dispt.start();
	}
}
