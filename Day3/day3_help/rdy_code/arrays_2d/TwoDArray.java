package arrays_2d;

import java.util.Arrays;

class TwoDArray {
	public static void main(String args[]) {
		int twoD[][] = new int[4][5];
		// display contents
	//	System.out.println(Arrays.toString(twoD));
//		System.out.println(Arrays.deepToString(twoD));
		int i, j, k = 0;

		for (i = 0; i < 4; i++)
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		System.out.println(Arrays.deepToString(twoD));
	}
}
