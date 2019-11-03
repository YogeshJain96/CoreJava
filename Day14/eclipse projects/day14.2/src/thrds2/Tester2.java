package thrds2;
//ensure no orphans
public class Tester2 {

	public static void main(String[] args) throws Exception{
		System.out.println("main strted");
		//create 2 thrds --IO & joining 
		Thread t1=new Thread(new IOTask(), "io");
		Thread t2=new Thread(new JoiningTask(t1), "joining");
		t1.start();t2.start();
		System.out.println("main waiting for child thrds to finish exec");
		t1.join();
		t2.join();
		System.out.println("main over");

	}

}
