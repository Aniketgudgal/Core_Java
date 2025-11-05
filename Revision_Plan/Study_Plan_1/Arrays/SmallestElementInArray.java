//2. Find the Smallest Element in an Array
import java.util.Scanner;
public class SmallestElementInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		// insert values in array
		System.out.print("Enter the value in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// find smallest value in array
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("The Smallest Element in Array is: "+min);
	}
}