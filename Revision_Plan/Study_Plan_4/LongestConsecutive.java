/*
Longest Consecutive Sequence
*/
import java.util.Scanner;
public class LongestConsecutive
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
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		int len = 1;
		int count = 1;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				continue;
			}
			if(arr[i+1] == arr[i]+1)
			{
				count++;	
			}
			else
			{
				count = 1;
			}
			if(count > len)
			{
				len = count;
			}
		}
		System.out.println("The max consecutive is: "+len);
	}
}