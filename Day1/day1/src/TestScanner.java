import java.util.Scanner;
class TestScanner {
	public static void main(String[] args)
	{
		//create scanner's object
		Scanner sc=new Scanner(System.in);
		//prompt user for i/p
		System.out.println("Enter int double boolean string");
		System.out.printf("int %d double %.2f boolean %b string %s %n",sc.nextInt(),sc.nextDouble(),sc.nextBoolean(),sc.next());
	}
}