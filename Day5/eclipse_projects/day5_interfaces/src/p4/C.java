package p4;

public class C implements A, B {

	@Override
	public void test() {
		//access data from 2 i/fs
		System.out.println(A.data);
		System.out.println(B.data);

	}

}
