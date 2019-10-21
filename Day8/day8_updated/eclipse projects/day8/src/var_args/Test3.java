package var_args;


import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		Integer[] ints={4,5,12,45,67,890};
		System.out.println(ints.getClass().getName());
		List<Integer> l1=Arrays.asList(ints);
		for(int i:l1)
			System.out.println(i);
		//l1.add(23);//un supported operation exc
		//l1.remove(0);//un supported operation exc
		l1.set(0, 345);//no err
		System.out.println(l1);
		//F.Q loaded class name
		System.out.println(l1.getClass().getName());
		

	}

}
