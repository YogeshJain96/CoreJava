package params_passing;

import java.util.Arrays;//helper class for array manipulation -- binarySearch,sort,toString...

class TestParamPassing5 {
	public static void main(String[] args) {
		//dynamic init of array
		int[] myData = { 1, 2, 3, 4, 5 };
		System.out.println("Orig data - " 
		+ Arrays.toString(myData));
		doubleIt(myData);
		System.out.println("New data - " 
		+ Arrays.toString(myData));
	}
	static void doubleIt(int[] ints) {
		int[] tmp = new int[ints.length * 2];
		for (int i = 0; i < ints.length; i++) {
			tmp[i] = ints[i] * 2;
		}
	}
}
