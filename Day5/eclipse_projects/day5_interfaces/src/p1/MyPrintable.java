package p1;

public class MyPrintable implements Printable{
	@Override
	public void print(String mesg) {
		//implementation classes can DIRECTLY 
		//(w/o i/f name.member name) access data members
		System.out.println("data "+data);
		System.out.println("in my printable "+mesg);
	}

}
