// 2. Create a class Calculator with 2 private double data members firstNumber & secondNumber.
// Supply getters & setters.
// Add 4 instance methods add,subtract,multiply & divide , without parameters , to return result of calculation.
// Divide method should return 0 in case of 0 denominator.
// Create a TestCalculator in pkg tester class with scanner.
// Accept 2 numbers from user & set them in Calculator.
// Menu 1: Add
// 2 : Subtract 
// 3 : Multiply
// 4 : Divide
// 5 :Exit.

package tester;
import com.app.Calculator;
import java.util.Scanner;

class TestCalculator{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double n1,n2;
	System.out.println("Enter Num 1");
	n1=sc.nextDouble();
	System.out.println("Enter Num 2");
	n2=sc.nextDouble();

	Calculator cal=new Calculator();
	//Calling Setters
	cal.setFirst(n1);
	cal.setSecond(n2);
	//Checking Values
	cal.Display();
	
	int ch;
	do{
		System.out.println("MENU \n1 : Add\n2 : Subtract \n3 : Multiply\n4 : Divide\n5 :Exit\nEnter Choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1:System.out.println("Add Value : "+cal.Add());
				break;
			case 2:System.out.println("Subtract Value : "+cal.Subtract());
				break;
			case 3:System.out.println("Multiply : "+cal.Multiply());
				break;
			case 4:System.out.println("Divide : "+cal.Divide());
				break;
			case 5:System.out.println("Exit");
				break;
			default:System.out.println("Invalid Choice");
			}
	}
	while(ch!=5);
	}
}