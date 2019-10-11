// 3. Display food menu to user. User will select items from menu along with the quantity. Hard code food prices. 
//(eg 1. Dosa 2. Samosa .......10 . Generate Bill ) When user enters 'Generate Bill' option, display total bill & exit.
// Create above class in "tester" package

package tester;
import java.util.Scanner;

class FoodMenu{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int bill=0;
	int ch;
	do{
		System.out.println("FOOD MENU \n1 : IDLI Rs.25\n2 : Dosa Rs.30/- \n3 : Samosa Rs.10/-\n4 : Generate Bill\n5 : Exit\nEnter Choice:");
		ch=sc.nextInt();
		switch(ch){
			case 1:bill=bill+25;
				System.out.println("Idli : Rs.25 Added\nBill="+bill);
				break;
			case 2:bill=bill+30;
				System.out.println("Dosa : Rs.30 Added\nBill="+bill);
				break;
			case 3:bill=bill+10;
				System.out.println("Samosa : Rs.10 Added\nBill="+bill);
				break;
			case 4:System.out.println("Total Bill : "+bill);
				break;
			case 5:System.out.println("Exit");
				break;
			default:System.out.println("Invalid Choice");
			}
	}
	while(ch!=5);
	}
}