package sets;

import java.util.HashSet;

public class EmpSet2 {

	public static void main(String[] args) {
		/*
		 * 2.1 Create empty HS to store emp info. 
		 * 2.2 Add dups & observe.
		 *  
		 */
		HashSet<Emp> emps=new HashSet<>();
		Emp e1=new Emp(100, "abc", 1000);
		Emp e2=new Emp(100, "abc", 1000);
		Emp e3=new Emp(15, "abc2", 10000);
		Emp e4=new Emp(34, "abc24", 11000);
		
			
	
		System.out.println("Added "+emps.add(e1));
		System.out.println();
		System.out.println("Added "+emps.add(e2));
		System.out.println();
		System.out.println("Added "+emps.add(e3));
		System.out.println();
		System.out.println("Added "+emps.add(e4));
		System.out.println();
		System.out.println(emps);
		System.out.println(emps.size());

	}

}
