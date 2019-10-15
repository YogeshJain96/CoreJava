package p1;
import static p1.Printable.*;

public class Tester2 {

	public static void main(String[] args) {
		// i/f ref can DIECTLY (w/o type casting) refer
		// to any imple class instance.
		Printable p = new MyPrintable();// up casting
		p.print("some mesg!!!");// D.M.D

		p = new OtherPrintable();//up casting
		p.print("some mesg!!!");//DMD
		//how to access data from here ?
		System.out.println(data);

	}

}
