/*
Move Zeroes
Move all zeros in the array to the end while maintaining the order of non-zero elements.
Example
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
import java.util.Scanner;
public class MoveZeros
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = arr.length;
		for(int i = 0; i < count;)
		{
			if(arr[i] != 0)
			{
					i++;
			}
			else
			{
				for(int j = i; j < arr.length - 1; j++)
				{
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
				count--;
			}
		}
		System.out.println("Result array");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}