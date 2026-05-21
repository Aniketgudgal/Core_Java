/*
Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
	Second Array :-  6 7 8 9 10 
*/
import java.util.Scanner;
public class MergeTwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of First Array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.print("Enter the values in first array: ");
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of second Array: ");
		size = sc.nextInt();
		int[] arr2 = new int[size];
		System.out.print("Enter the values in second Array: ");
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		// sort first Array
		for(int i = 0; i < arr1.length - 1; i++)
		{
			for(int j = i+1; j < arr1.length; j++)
			{
				if(arr1[i] > arr1[j])
				{
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		// sort second array
		for(int i = 0; i < arr2.length -1; i++)
		{
			for(int j = i+1; j < arr2.length; j++)
			{
				if(arr2[i] > arr2[j])
				{
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		int[] result = new int[arr1.length + arr2.length];
		int i = result.length - 1;
		int j = arr1.length -1;
		int k = arr2.length - 1;
		while(j >= 0 && k >= 0)
		{
			if(arr1[j] > arr2[k])
			{
				result[i] = arr1[j];
				i--;
				j--;
			}
			else
			{
				result[i] = arr2[k];
				k--;
				i--;
			}
		}
		while(j >= 0)
		{
			result[i] = arr1[j];
			j--;
			i--;
		}
		while(k >= 0)
		{
			result[i] = arr2[k];
			k--;
			i--;
		}
		System.out.print("result array is: ");
		for(i = 0; i < result.length; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}