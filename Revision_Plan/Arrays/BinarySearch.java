/*
binary search algorithm
*/
import java.util.Scanner;
public class BinarySearch
{
	public static void main(String x[])
	{
		// only input the sorted array
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int num[] = new int[size]; //3 < 5
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.print("Enter the search key: ");
		int key = sc.nextInt();
		int index = -1; // default values or we can store the search element index
		int start = 0;
		int end = num.length - 1;
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			if(num[mid] == key)
			{
				index = mid;
				break;
			}
			if(num[mid] < key)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		if(index != -1)
		{
			System.out.println("The Key is found in array");
		}
		else
		{
			System.out.println("not found in array");
		}
	}
}