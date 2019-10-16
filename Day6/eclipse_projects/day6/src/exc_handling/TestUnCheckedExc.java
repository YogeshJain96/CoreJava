package exc_handling;

public class TestUnCheckedExc {

	public static void main(String[] args) {
		try {
		int a=100;
		int b=10;
		System.out.println("res="+(a/b));
		String s="1234";
		System.out.println(Integer.parseInt(s));
		String ss=null;
		System.out.println(ss.length());
		System.out.println("end of try");
		}/* catch (ArithmeticException e) {
		//	System.out.println(e);
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}*/
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
