package arrays_2d;
public class Array2DAgain
{
	public static void main(String[] args)
	{
		int[] arr[] = { { 10, 20, 30 }, { 40, 50} };
		
		for( int i = 0; i < arr.length; ++ i )
		{
			for( int j = 0; j < arr[i].length; ++ j )
			{
				System.out.print(arr[ i ][ j ]+"	");				
			}
			System.out.println();
		}
	}
}
