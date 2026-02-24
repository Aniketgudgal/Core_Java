/*
Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
            Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
*/
import java.util.Scanner;
public class MergeTwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first Array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.print("Enter the values in first array: ");
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < arr1.length - 1; i++)
		{
			for(int j = i+1; j < arr1.length; j++)
			{
				if(arr1[i] > arr1[j])
				{
					arr1[i] = arr1[i] + arr1[j];
					arr1[j] = arr1[i]- arr1[j];
					arr1[i] = arr1[i] - arr1[j];
				}
			}
		}
		System.out.print("Enter the size of second array: ");
		size = sc.nextInt();
		int[] arr2 = new int[size];
		System.out.print("Enter the values in second array: ");
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		for(int i = 0; i < arr2.length - 1; i++)
		{
			for(int j = i+1; j < arr2.length; j++)
			{
				if(arr2[i] > arr2[j])
				{
					arr2[i] = arr2[i] + arr2[j];
					arr2[j] = arr2[i] - arr2[j];
					arr2[i] = arr2[i] - arr2[j];
				}
			}
		}
		int[] result = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr1.length && j < arr2.length)
		{
			if(result[k] < arr1[i])
			{
				result[k]= arr1[i];
				k++;
				i++;
			}
			else if(result[k] < arr2[j])
			{
				result[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i < arr1.length)
		{
			result[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length)
		{
			result[k] = arr2[j];
			j++;
			k++;
		}
		System.out.print("The result array is: ");
		for(i = 0; i < result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
	}
}