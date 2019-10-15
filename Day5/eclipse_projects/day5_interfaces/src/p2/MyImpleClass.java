package p2;

public class MyImpleClass implements Printable,Sortable{

	@Override
	public void sort() {
		System.out.println("in sort");
		
	}

	@Override
	public void print(String mesg) {
		System.out.println("in print");
		
	}

}
