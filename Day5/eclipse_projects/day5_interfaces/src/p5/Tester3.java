package p5;

public class Tester3 {

	public static void main(String[] args) {
		Bank[] banks = { new BoB(), new HDFC() };
		for (Bank b : banks) {
			b.transferFunds(10, 20, 1000);
			if (b instanceof HDFC)
				((HDFC) b).payBills();
			else
				System.out.println("feature un supported!!!!");
		}

	}

}
