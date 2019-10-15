package Employee;

public class Worker extends Emp {
	private double hoursWorked,hourlyRate;
	
	public Worker(String name,String email,String deptId,double basic,double hoursWorked,double hourlyRate) {
		super(name,email,deptId,basic);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	@Override
	public String toString() {
		return super.toString()+" | hoursWorked : "+hoursWorked+" | hourlyRate : "+hourlyRate;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	public double computeNetSalary(){
		return getBasic()+(hourlyRate*hoursWorked);
	}
}
