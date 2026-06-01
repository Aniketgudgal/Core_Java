// second max duplicate Element from array
import java.util.Scanner;
public class TestApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take the array size from user
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		//insert data into array
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[j] > max)
				{
					max = arr[j];
				}
			}
			int sMax = secondMax(arr,max);
			if(isDuplicate(arr, sMax))
			{
				System.out.println("Result is: "+sMax);
				flag = true;
			}
			if(flag)
			{
				break;
			}
		}
	}
	public static int secondMax(int arr[], int max)
	{
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > secondMax && arr[i] < max)
			{
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	public static boolean isDuplicate(int[] arr, int n)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(count > 1)
			{
				return true;
			}
			if(arr[i] == n)
			{
				count++;
			}
		}
		return false;
	}	
}