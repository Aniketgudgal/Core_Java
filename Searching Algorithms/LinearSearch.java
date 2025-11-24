/*
Linear Search Algorithm
---------------------------------------------------
this algorithm works on the unsorted array
*/
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take the size of array from user
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.print("Enter the search key: ");
		int key = sc.nextInt();
		int index = -1; // default values
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] == key)
			{
				index = i;
				break;
			}
		}
		if(index != -1)
		{
			System.out.println("The Key is found in Array");
		}
		else
		{
			System.out.println("Key is not present in Array");
		}
	}
}