/*
Second Largest Element
Find the second largest element in an array in one pass
*/
import java.util.Scanner;
public class SecondLargestElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int secondMax = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if (arr[i] > secondMax && arr[i] < max)
			{
				secondMax = arr[i];
			}
		}
		System.out.println("The second max is: "+secondMax);
	}
}