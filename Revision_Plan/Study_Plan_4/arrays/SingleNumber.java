/*
Single Number
Every element appears twice except one. Find that single one.
Example
Input: [4,1,2,1,2] → 4
*/
import java.util.Scanner;
public class SingleNumber
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
		boolean flag = true;
		/*for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
					count++;
				if(count > 2)
				{
					flag = false;
					break;
				}
			}
			if(count < 2 && flag)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		*/
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			count ^= arr[i];
		}
		System.out.println("result is: "+count);
	}
}