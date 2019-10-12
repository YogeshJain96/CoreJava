package arrays_2d;

import java.util.Arrays;

class Simple2DArray {
	public static void main(String args[]) {
		int[][] twoD = new int[4][5];
		// display contents
		System.out.println("Default initialised contents");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		int k = 0;

		for (int i = 0; i < twoD.length; i++)
			for (int j = 0; j < twoD[i].length; j++) {
				twoD[i][j] = k;
				++k;
			}
		System.out.println("Initialised contents");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		System.out.println("Testing!!!!!");
		//display array data using for-each
		System.out.println(twoD.getClass().getName());
		for(int[] ints : twoD)
		{
			System.out.println(ints.getClass().getName());
			for(int i : ints)
			{
				System.out.println(i);
			}
		}
		System.out.println(Arrays.toString(twoD));
		System.out.println(Arrays.deepToString(twoD));
		
	}
}
