package tester;
import java.util.*;

class TestPrimitiveArray 
{
	public static void main(String[] args) 
	{
		//sc
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values ?");
		//create any array obj to hold double vals
		double[] data=new double[sc.nextInt()];
		//confirm def values : toString
		System.out.println(Arrays.toString(data));
		//populate array
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter next elem");
			data[i]=sc.nextDouble();
		}
		//doubling the values
		for(double d1 : data)//d1=data[0],d1=data[1]... 
			d1 *= 2;
	    System.out.println(Arrays.toString(data));
			

	}
}
