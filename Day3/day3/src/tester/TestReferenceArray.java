package tester;
import java.util.*;
import com.app.core.Box;
class TestReferenceArray 
{
	public static void main(String[] args) 
	{
			//sc
		Scanner sc=new Scanner(System.in);
		System.out.println("How many boxes ?");
		//create any array obj to hold box type of refs
		Box[] boxes=new Box[sc.nextInt()];
		System.out.println(Arrays.toString(boxes));
		//accept box dims , create boxes n display
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		//for-each
		for(Box b : boxes)//b=boxes[0],...b=boxes[boxes.length-1]
		{
			 b.displayDims();
			 System.out.println("Vol="+b.calcVolume());
		}
		for(Box b : boxes)
			b.setWidth(b.getWidth()*2);
		for(Box b : boxes)
		 b.displayDims();
		//display dtls via toString
		System.out.println(Arrays.toString(boxes));
	
	}
}
