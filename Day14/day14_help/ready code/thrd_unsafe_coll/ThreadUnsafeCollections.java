package thrd_unsafe_coll;

import java.util.*;

public class ThreadUnsafeCollections {
	public static void main(String[] args) throws Exception{
		List<Integer>list = new ArrayList<>(10000);
		for (int i = 0; i < 10_000; i++)
			list.add(i);
		Thread reader = new Thread(new Runnable() {
			
			@Override
			public void run() {
				ListIterator<Integer> iterator = list.listIterator();
				while (iterator.hasNext()) {
					Integer number = iterator.next();
					System.out.println(number);
				}
				
			}
		},"t1");
		Thread writer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 10_000; i < 20_000; i++) {
					list.add(i);
				}
				
			}
		},"t2");
			
		
		reader.start();
		writer.start();
		reader.join();
		writer.join();
		System.out.println("main over...");
	}
}