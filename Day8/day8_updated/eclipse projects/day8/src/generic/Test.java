package generic;

public class Test {

	public static void main(String[] args) {
		// create a holder to hold int data
		Holder<Integer> h1=new Holder<>(1234);//auto boxing
		int data=h1.getRef();//auto un boxing Integer --->int
		//Holder holding a string
		Holder<String> h2=new Holder<>("abcd");//NO conversion
		String s=h2.getRef();
	//h1=h2;
	}

}
