package bin_io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Emp implements Serializable{
	private int id;
	private String name;
	private double salary;
	//EMP HAS-A Address
	private transient Address adr;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary +" residing at "+adr;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	//link address
	public void linkAddress(String city, String cellNo)
	{
		adr=new Address(city, cellNo);
	}
	

}
