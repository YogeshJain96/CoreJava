package Tester;

import java.util.HashMap;
import static utils.CollectionUtils.populate;
import static utils.CollectionUtils.printType;
import java.util.Scanner;
import core.app.*;
import static cust_execs.Validation.*;

public class CustTester {
	public static void main(String[] args) {
		
		
		HashMap<String,Customer> custHM=new HashMap<>();
		custHM.putAll(populate());
		try(Scanner sc=new Scanner (System.in)){
		boolean exit=false;
		while(!exit) {
			System.out.println("Menu");
			System.out.println("1. Register new customer");
			System.out.println("2. Link Address"); 
			System.out.println("3. Customer Login");
			System.out.println("4. Un subscribe customer"); 
			System.out.println("5. Display all customers of a particular type(Silver/Gold/Platinum)"); 
			System.out.println("6. Update Address"); 
			System.out.println("7. Sort customers as per email"); 
			System.out.println("8. Sort customers as per reg date.");
			System.out.println("9. Display All");
			System.out.println("0.Exit");
			System.out.println("Enter Choice:");
			switch (sc.nextInt()) {
			case 1:
			{
				System.out.println("Enter email, password, regAmount, regDate, type");
				String email=sc.next();
				Customer tCust=new Customer(email,sc.next(),sc.nextDouble(),checkDate(sc.next()),checkType(sc.next()));
				custHM.putIfAbsent(email, tCust);
				
			}
				break;
			case 2:{
				System.out.println("Customer Login");
				System.out.println("Enter Email");
				String email=sc.next();
				System.out.println("Enter password");
				String pass=sc.next();
				if(checkLogin(email,pass,custHM))
				{
					Customer tempc=	custHM.get(email);
					System.out.println("Found"+tempc);
					System.out.println("Enter Address atype, city, country, phoneNo");
					tempc.linkAddress(sc.next(), sc.next(), sc.next(), sc.next());
				}
				else
					System.out.println("Login Failed");
				}				
				break;
			case 3:{
				System.out.println("Customer Login");
				System.out.println("Enter Email");
				String email=sc.next();
				System.out.println("Enter password");
				String pass=sc.next();
				if(checkLogin(email,pass,custHM))
					System.out.println("Login Successful");
				else
					System.out.println("Login Failed");
			}
				break;
			case 4:{
				System.out.println("4. Un subscribe customer");
				System.out.println("Enter Email");
				String email=sc.next();
				System.out.println(custHM.remove(email));
			}
				break;
			case 5:{
				System.out.println("Enter type");
				String type=sc.next();
				(printType(type,custHM)).forEach((k, v) ->System.out.println(k+" : "+v));
				} 
				break;
			case 6:{
				System.out.println("Customer Login");
				System.out.println("Enter Email");
				String email=sc.next();
				System.out.println("Enter password");
				String pass=sc.next();
				if(checkLogin(email,pass,custHM))
				{
					Customer tempc=	custHM.get(email);
					System.out.println("Found"+tempc);
					System.out.println(tempc.getAddress());
					System.out.println("Enter New Address atype, city, country, phoneNo");
					tempc.updateAddress(sc.next(), sc.next(), sc.next(), sc.next());
				}
				else
					System.out.println("Login Failed");
				} 
				break;
			case 7:
				System.out.println("7. Sort customers as per email"); 
				break;
			case 8:
				System.out.println("8. Sort customers as per reg date.");
				break;
			case 9:
				System.out.println("All Customers");
				custHM.forEach((k, v) ->System.out.println(k+" : "+v));
				break;
			case 0:
				System.out.println("Good Bye!");
				break;
			default:System.out.println("Invalid Choice");
				break;
			}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}