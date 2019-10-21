package nested_classes;

public class Outer {
	private int i = 11;

	class Inner {
		private int i = 12;

		void show(int i) {
			System.out.println("local i " + i);
			System.out.println("inner's i " + this.i);
			System.out.println("outer's i " + Outer.this.i);
		}
	}

	public static void main(String[] args) {
		/*
		 * Outer.Inner in=new Outer().new Inner(); in.show(13);
		 */
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.show(56);
	}

}
