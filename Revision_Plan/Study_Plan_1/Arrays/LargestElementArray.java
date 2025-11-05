//1. Find the Largest Element in an Array
import java.util.Scanner;
public class LargestElementArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		// create the array with given size
		int arr[] = new int[size];
		
		// insert values in array
		System.out.println("Enter the values in array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// find largest element in array
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest Element in Array is: "+max);
	}
}