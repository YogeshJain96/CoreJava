package nested_classes;

public class Tester {

	public static void main(String[] args) {
		//invoke print method of inner class
		A.B innerRef=new A(23).new B(56);
		innerRef.print();

	}

}
