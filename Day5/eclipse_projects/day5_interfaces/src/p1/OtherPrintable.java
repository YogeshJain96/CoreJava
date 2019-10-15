package p1;

public class OtherPrintable implements Printable {

	@Override
	public void print(String mesg) {
		System.out.println("in other printable "+mesg.toUpperCase());

	}

}
