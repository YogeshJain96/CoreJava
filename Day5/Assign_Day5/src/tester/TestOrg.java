package tester;
import java.util.Scanner;
import Employee.*;

public class TestOrg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Organization Employee Size:");
		int n=sc.nextInt();
		Emp[] e=new Emp[n];
		int countEmp=0;
		
		//Menu
		boolean exit=false;
		while(!exit) {
			System.out.println("Menu:");
			System.out.println("1: Hire Manager");
			System.out.println("2: Hire Worker");
			System.out.println("3: Display All Emp Details");
			System.out.println("4: Display Specific Emp Details");
			System.out.println("5: Salary Increment");
			System.out.println("6: Display employee specific details");
			System.out.println("0: Exit");
			System.out.println("Enter Choice:");
			
			
			switch (sc.nextInt()) {
			case 1:{
				if(countEmp<n)
				{
				System.out.println("Add Manager Details: Name,Email,DeptId,BasicSal,perfBonus");
				e[countEmp++]=new Mgr(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
				}
				else
					System.out.println("Org Emp Recuritement Size Full !!");
				}
				break;
			case 2:{
				if(countEmp<n)
				{
				System.out.println("Add Worker Details: Name,Email,DeptId,BasicSal,hoursWorked,hourlyRate");
				e[countEmp++]=new Worker(sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
				}
				else
					System.out.println("Org Emp Recuritement Size Full !!");
				}
				break;
			case 3:System.out.println("Employees Details");
				for(Emp tempe:e) {
					if(e!=null)
						System.out.println(tempe.toString()+" | Total Salary="+tempe.computeNetSalary());
				}
				break;
			case 4:
				{
					System.out.println("Enter EmpId to View:");
					int eid=sc.nextInt();
					if(eid%100<=n)
						System.out.println(e[eid%100-1].toString()+" | Total Salary="+e[eid%100-1].computeNetSalary());
					else
						System.out.println("Invalid Employee ID");
				}
				break;
			case 5:{
				System.out.println("Enter EmpId to Update Salary:");
				int eid=sc.nextInt();
				double incSal=sc.nextDouble();
				if(eid%100<=n)
				{	e[eid%100-1].updateBasic(incSal);
					System.out.println(e[eid%100-1].toString()+" | Total Salary="+e[eid%100-1].computeNetSalary());
				}
				else
					System.out.println("Invalid Employee ID");
			}
				break;
			case 6:{
				System.out.println("Enter EmpId:");
				int eid=sc.nextInt();
				if(eid>=101 && eid <=100+n) {
				if(e[eid-101] instanceof Mgr)
				{
					System.out.println("Performance Bonus is: "+ ((Mgr)e[eid-101]).getPerfBonus());
				}
				else if(e[eid-101] instanceof Worker)
				{
					System.out.println("Worker's Hourly rate is: "+ ((Worker)e[eid-101]).getHourlyRate());
				}
				else
					System.out.println("EID Doesn't Exist");
				}
				else
					System.out.println("EID Invalid");
			}
				break;	
			case 0:System.out.println("Bye!");
					exit=true;
				break;
			default:System.out.println("Invalid Choice!");
				break;
			}
		
		}
		
	}

}
