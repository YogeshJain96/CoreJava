package thrds2;
//ensure no orphans + interrupt
public class Tester3 {

	public static void main(String[] args) throws Exception{
		System.out.println("main strted");
		//create 2 thrds --IO & joining 
		Thread t1=new Thread(new IOTask(), "io");
		Thread t2=new Thread(new JoiningTask(t1), "joining");
		t1.start();t2.start();
		System.out.println("main waiting for child thrds to finish exec");
		t1.join(1000);
		t2.join(500);
		System.out.println("main sending interrupts to child thrds");
		t1.interrupt();
		t2.interrupt();
		System.out.println(t1.isAlive()+" "+t2.isAlive());
		System.out.println("confirming if thrds are really dead!!!");
		t2.join();
		System.out.println("t2 over");

		t1.join();
		System.out.println("t1 over");
	
		System.out.println("main over");

	}

}
