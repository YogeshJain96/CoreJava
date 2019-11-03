package thrds2;

import static java.lang.Thread.*;

import java.io.IOException;

public class IOTask implements Runnable {

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted");
		try {
			System.out.println("Press enter to continue");
			int data=System.in.read();
			System.out.println("read data "+data);
		} catch (IOException e) {
			System.out.println("err in " + currentThread().getName() + " exc " + e);
		}
		System.out.println(currentThread().getName() + " over");

	}

}
