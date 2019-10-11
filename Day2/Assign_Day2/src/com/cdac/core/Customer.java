//1. Create a Customer class , in a package com.cdac.core with data members 
//name(string),email(string),age(int), creditLimit(double)
//1.1 Supply a parameterized constructor to accept all details from user
//1.2 Supply an argument less  constructor to init name to "Rama" , email to "rama@gmail.com",age=25,creditLimit=10000
//1.3 Supply another constructor , to init creditLimit to 15000, taking rest of the i/ps from user.
//1.4 Write a method , getDetails to return string form of customer name & credit limit details.
//1.5 Supply getter & setter for creditLimit.

//Must make use of this(...) for constructor chaining.

//1.6 Write a TestCustomer class in "tester" package ,  to test all of above.
//Using Scanner , accept customer details suitably & test all 3 constructors.
//Display customer details.
//Increase credit limit of the 1st customer by 1000 & display details again.
package com.cdac.core;
public class Customer
{
	private String name;
	private String email;
	private int age;
	private double creditlimit;

	 public Customer(String name, String email,int age,double creditlimit)
	 {
	 		this.name=name;
	 		this.email=email;
	 		this.age=age;

	 		this.creditlimit=creditlimit;
	 }

	 public Customer()
	 {
	 	/*name="Rama";
	 	email="rama@gmail.com";
	 	age=25;
	 	creditlimit=10000;*/
	 	this("Rama","rama@gmail.com",25,10000);
	 }
	
	 public Customer(String name,String email,int age)
	 {
	 	this(name,email,age,15000);
	 }


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