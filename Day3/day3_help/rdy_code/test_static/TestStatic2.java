package test_static;

public class TestStatic2 {
     static int counter=10;
     private int i;//instance data member
     //static init block : invoked only once per class loading 
     static {
    	 System.out.println("in 1st static block");
    	 System.out.println("fm static init block counter = "+(counter++));
    	 testIt();
    
     }
     static {
    	 System.out.println("in 2nd static block");
    	
     }
     
     public TestStatic2(int i) {
		System.out.println("in constr ");
		this.i = i;
	}
	//inst. init block : invoked once per instantiation
     //typically replced by a parameterized constr.
     {
    	 System.out.println("in inst init block"); 
     }
	
	
	static void testIt()
	{
	
		System.out.println("fm testIt counter="+counter++);
	}

}
