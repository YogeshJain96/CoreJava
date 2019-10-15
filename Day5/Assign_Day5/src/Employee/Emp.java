package Employee;

public abstract class Emp {
//	Emp state--- id(int --system generated: auto increment), name, email,deptId , basic(double)
//	Use static init block --to init id counter to 100.
//
//	Behaviour --- get emp details -- via toString
	private static int count;
	private int id;
	private String name,email,deptId;
	private double basic;
	
	static {
		count=100;
	}
	
	public Emp(String name,String email,String deptId,double basic){
		this.id=++count;
		this.name=name;
		this.email=email;
		this.deptId=deptId;
		this.basic=basic;
	}
	
	public double getBasic() {
		return basic;
	}
	
	public void updateBasic(double upInc) {
		this.basic=basic+upInc;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+" | Name :"+name+" | Email: "+email+" | DeptID: "+deptId+" | Basic: "+basic;
	}
	
	public abstract double computeNetSalary();
	
}
