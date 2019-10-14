package Employee;

public class Mgr extends Emp 
{
	private double perfBonus;
	
	public Mgr(String name,String email,String deptId,double basic,double perfBonus)
	{
		super(name,email,deptId,basic);
		this.perfBonus=perfBonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+" | perfBonus: "+perfBonus;
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}
	
	public double computeNetSalary(){
		return getBasic()+perfBonus;
	}
}
