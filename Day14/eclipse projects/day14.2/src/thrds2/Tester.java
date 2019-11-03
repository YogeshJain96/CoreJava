package thrds2;
//orphan thrds
public class Tester {

	public static void main(String[] args) {
		System.out.println("main strted");
		//create 2 thrds --IO & joining 
		Thread t1=new Thread(new IOTask(), "io");
		Thread t2=new Thread(new JoiningTask(t1), "joining");
		t1.start();t2.start();
		System.out.println("main over");

	}

}
