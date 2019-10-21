package non_generic;

public class Test {

	public static void main(String[] args) {
		// create a holder to hold an int
		Holder h1=new Holder(1234);//int --->Integer ---Object
		int data=(Integer)h1.getRef();//explicit down-casting is essential
		// create a holder to hold a string
		Holder h2=new Holder("abcd");//string---> obj up casting
		String s=(String)h2.getRef();//explicit down-casting is essential
	    h1=h2;
	    data=(int)h1.getRef();
	}

}
