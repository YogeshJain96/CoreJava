// // 4. Write a class Converter.java
// // Add static methods for conversion & returning result  to caller.
// // 5.1 Convert pounds to kilogram(1 pound=0.4536 Kg)
// // eg : I/P 100
// // O/p 45.36Kg
// // 5.2 Convert the temperature in Celsius to Fahrenheit (F = C× 9/5 + 32)
// // 5.3 Convert seconds into a formatted string , to display hour,min,seconds
// // eg : I/P 67890
// // O/P  18h51m30s
// package com.app;

// public class Converter{
	
// 		public static double p2k(double pounds){
// 			return 0.4536*pounds; 
// 		}
		
// 		public static double c2f(double celsius){
// 			return (celsius*(9/5))+32; 
// 		}
		
// 		public static String s2h(int s){
// 			String time;
// 			int h=s/3600;
// 			s=s%3600;
// 			int m=s/60;
// 			s=s%60;
// 			time="H:"+h+"  M:"+m+"  S:"+s;
// 			return time;
// 		}
// }
package com.app;
public class Cabcd
{
	private String name;
	private String email;
	private int age;
	private double creditlimit;

	// Customer(String name, String email,int age,double creditlimit)
	// {
	// 		this.name=name;
	// 		this.email=email;
	// 		this.age=age;

	// 		this.creditlimit=creditlimit;
	// }

	// Customer()
	// {
	// 	name=Rama;
	// 	email=rama@gmail.com;
	// 	age=25;
	// 	creditlimit=10000;
	// 	this(Rama,rama@gmail.com,25,10000)
	// }
	
	// Customer(String name,String email,int age)
	// {
	// 	this(name,email,age,15000)
	// }


	public String getDetails()
	{
		String details;
		details= name+creditlimit;
		return details;
	}

	public double getCreditLimit()
	{
		return creditlimit;
	}

	public void setCreditLimit(double creditlimit)
	{
		this.creditlimit=creditlimit;
	}

	public void display()
	{
		System.out.println("Name :"+name+" Email : "+email+" Age : "+age+" creditlimit : "+creditlimit);
	}

}