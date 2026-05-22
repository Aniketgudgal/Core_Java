/*
 Write a Java program to Find longest continuous increasing subsequence.
Input :- 10 20 15 16 17 5 6 7 8
Output :- Longest increasing sequence length: 4
 Sequence: 5 6 7 8
*/
import java.util.Scanner;
public class LongestContinuousIncSub
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i =0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int len = 0;
		int count = 1;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i+1] - arr[i] == 1)
			{
				count++;
				if(count > len)
				{
					len = count;
				}
			}
			else 
			{
				if(count > len)
				{
					len = count;
				}
				count  = 1;
			}
		}
		System.out.println("Longest increasing subsequence length is: "+len);
	}
}