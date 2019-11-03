/*Create java application for the following.
In main thread --get populated (hard coded) list of Emps (eg : ArrayList<Emp> )
Emp -- id(int),name(string),salary(double),hireDate(LocalDate)

Pass the SAME emp list to 3 threads (sharing of common resource) 
t1 -- sorts the list as per emp name & stores in in txt file (t1.txt)
t2 -- sorts the list as per emp salary & stores in in txt file (t2.txt)
t3 -- sorts the list as per emp hire date & stores in in txt file (t3.txt)
*/
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
		SortByName(list).forEach((v) ->System.out.println(v));
		SortBySal(list).forEach((v) ->System.out.println(v));
		SortByHiredate(list).forEach((v) ->System.out.println(v));
		
		System.out.println("Creating Threads...");
		NameThread nt = new NameThread("NameThread", SortBySal(list),"t1.txt");
		SalSortThread st = new SalSortThread("SalThread", SortBySal(list),"t2.txt");
		HiredateThread ht = new HiredateThread("HiredateThread", SortBySal(list),"t3.txt");
		nt.start();
		st.start();
		ht.start();
		DispThread dispt = new DispThread("DispThread");
		dispt.start();
	}
}
