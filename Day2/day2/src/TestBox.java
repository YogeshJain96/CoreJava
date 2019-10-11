import java.util.Scanner;
class TestBox 
{
	public static void main(String[] args) 
	{
		//sc 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter box dims w d h");
		Box b1;//As per JVM spec 4/8/16 bytes are allocated on stack
        //System.out.println(b1);
	//	b1=new Box();//javac err
	    b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		//display dims
		b1.displayDims();
		//fetch dims & n display them
		System.out.println(b1.fetchDims());
		//display vol
		System.out.println("Volume ="+b1.calcVolume());
		Box b2=b1;//copy of refs --- b1 & b2 both are referring to the SAME Box object
		b1=null;//no objs are marked for GC
	//	b1.displayDims();//null ptr exc
		b2.displayDims();
		b2=null;//1 Box obj marked for GC.
	//	b2.displayDims();



	}
}
