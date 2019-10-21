package sets;

import java.util.HashSet;

public class EmpSet {

	public static void main(String[] args) {
		/*
		 * 2.1 Create empty HS to store emp info. 
		 * 2.2 Add dups & observe.
		 *  
		 */
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp(100, "abc", 1000);
		Emp e2=new Emp(100, "abc", 1000);
		
	//	Emp e3=e1;
		emps.add(e1);
	//	System.out.println(e1.hashCode()+" "+e2.hashCode());
		emps.add(e2);
	//	emps.add(e3);
		System.out.println(emps);
		System.out.println(emps.size());

	}

}
