import java.util.Scanner;
public class TwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of row: ");
		int row = sc.nextInt();
		int[][] arr = new int[row][];
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter the size of "+arr[i]+" row column size: ");
			int size = sc.nextInt();
			arr[i] = new int[size];
		}
		// Enter values in Array
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter the values in Array");
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		// display array
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}