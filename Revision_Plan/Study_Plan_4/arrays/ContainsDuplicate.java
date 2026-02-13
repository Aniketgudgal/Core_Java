/*
Contains Duplicate
Given an integer array nums, return true if any value appears at least twice.
Example
Input: [1,2,3,1] → true
Input: [1,2,3,4] → false
*/
import java.util.Scanner;
public class ContainsDuplicate
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the value in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		// sorting array
		/*
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
		*/
		System.out.println("twice appears or not: "+contaisDuplicate(arr));
		/*
		int count = 1;
		boolean flag = false;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i-1] == arr[i])
			{
				count++;
			}
			if(count > 1)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("The element appears twice in this array: "+flag);
		}
		else
		{
			System.out.println("not appears any element in twice: "+flag);
		}
		*/
	}
	public static boolean contaisDuplicate(int[] arr)
	{
		int[] hash = new int[1000];
		boolean flag = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(hash[arr[i]] == 1)
			{
				flag = true;
				break;
			}
			hash[arr[i]]++;
		}
		
		return flag;
	}
}