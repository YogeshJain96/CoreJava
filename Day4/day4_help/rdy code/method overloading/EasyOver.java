package tester;

class EasyOver {
	
	 static void go(short x) { System.out.print("short "); }
	 
	static void go(int x) {
		System.out.print("int ");
	}

	static void go(float x) {
		System.out.print("float ");
	}

/*	static void go(double x) {
		System.out.print("double ");
	}*/

	public static void main(String[] args) {
		byte b = 5;
	short s = 5;
		long l = 5;
		double f = 5.0;
		go(f);
	/*	go(s);
		go(l);
		go(f);*/
	}
}
