package p5;

public class Tester1 {

	public static void main(String[] args) {
		Bank ref=new BoB();//up casting
		System.out.println(ref.createAccount("aa", "saving", 5000));
		ref=new HDFC();
		System.out.println(ref.createAccount("bb", "current", 4000));

	}

}
