package Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import com.app.core.Emp;

public class CollectionUtils {
	public static HashMap<String, Emp> populate() {
		HashMap<String, Emp> hm = new HashMap<>();
		ArrayList<Emp> al = new ArrayList<>();
		al.add(new Emp("101", "Abc", "111", "Accounts", 50000));
		al.add(new Emp("102", "bcd", "111", "Accounts", 40000));
		al.add(new Emp("103", "cde", "111", "Accounts", 35000));
		al.add(new Emp("104", "efg", "111", "Accounts", 60000));

		al.add(new Emp("105", "fgh", "222", "Sales", 70000));
		al.add(new Emp("106", "ghi", "222", "Sales", 80000));
		al.add(new Emp("107", "hij", "222", "Sales", 90000));
		al.add(new Emp("108", "jkl", "222", "Sales", 20000));

		al.add(new Emp("109", "klm", "333", "Manufacturing", 55000));
		al.add(new Emp("110", "lmn", "333", "Manufacturing", 95000));
		al.add(new Emp("111", "nop", "333", "Manufacturing", 100000));
		al.add(new Emp("112", "opq", "333", "Manufacturing", 99000));

		for (Emp e : al)
			hm.put(e.getEmpId(), e);

		return hm;
	}

	public static ArrayList<Emp> SortBySal(ArrayList<Emp> temp) {
		// Sorting as per Salary
		Collections.sort(temp, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return ((Integer) o1.getSal()).compareTo(o2.getSal());
			}
		});
		return temp;
	}

	public static ArrayList<Emp> SortByDept(ArrayList<Emp> temp) {
		// Sorting HM as per Department ID
		Collections.sort(temp, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return ((String) o1.getDeptId()).compareTo(o2.getDeptId());
			}
		});
		return temp;
	}
}
