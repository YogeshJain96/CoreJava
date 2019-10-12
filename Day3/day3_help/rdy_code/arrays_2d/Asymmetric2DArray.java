package arrays_2d;
public class Asymmetric2DArray
{
	public static void main(String[] args)
	{
		int[][]arr = new int[3][];
		arr[ 0 ] = new int[]{ 10, 20 };
		arr[ 1 ] = new int[]{ 30, 40, 60 };
		arr[ 2 ] = new int[]{ 70, 80, 90, 100 };
		
		for( int i = 0; i < arr.length; ++ i )
		{
			for( int j = 0; j < arr[ i ].length; ++ j )
				System.out.print(arr[ i ][ j ]+"	");
			System.out.println();
		}
	}
}
