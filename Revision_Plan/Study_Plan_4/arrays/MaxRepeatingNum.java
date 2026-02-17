/*
Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
*/
import java.util.Scanner;
public class MaxRepeatingNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int num = 0;
		int max = 0;
		for(int i = 0; i < arr.length -1; i++)
		{
			int count = 0;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count > max)
			{
				max = count;
				num  = arr[i];
			}
		}
		System.out.println("The maximum repeating number is: "+num);
	}
}