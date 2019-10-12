package arrays_2d;

import java.util.Arrays;

class Simple2DArrayForEach {
	public static void main(String args[]) {
		int[][] twoD = new int[4][5];
		// display contents
		System.out.println("Default initialised contents");
		for (int[] i : twoD) {
			for (int j : i)
				System.out.print(j+" ");
			System.out.println();
		}
		int k = 0;

		for (int i = 0; i < twoD.length; i++)
			for (int j = 0; j < twoD[i].length; j++) {
				twoD[i][j] = k;
				++k;
			}
		System.out.println("Initialised contents");
		for (int[] i : twoD) {
			for (int j : i)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
