package wrappers;

public class Test {

	public static void main(String[] args) {
		//OR valueOf
		Integer i1=new Integer(1234);//boxing
		int data=i1.intValue();//un boxing
		data=i1;//w --> auto done by javac --auto un boxing
		/*
		 * System.out.println(Integer.MIN_VALUE); System.out.println(Integer.MAX_VALUE);
		 */
		i1=3456;//auto boxing
		String s="dsgf";
		//s++;
		i1++;//auto un boxing int tmp=i1.intValue() --tmp++--auto box
		System.out.println(i1);
		//Double d=new Double(34.56); OR Double d=Double.valueOf(34.56);
		Double d=34.56;//double ---> Double ---auto boxing
		Float f=23.45f;
		double d1=f;//auto conv --widening conversion
	//	d=f;//float --->Float(auto boxing) ---X Double
		Number n=34.56f;//float--->Float(auto box) --Number (up casting)
		System.out.println(n);
		Object o=true;//boolean -->Boolean --Object
		o=45.67f;//auto boxing --upcasting
	}

}
