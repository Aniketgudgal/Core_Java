/*
Check Duplicate Integers
Description
Determine whether a list contains duplicate integers.
Example
Input:
[1,2,3,1]
Expected Output:
Duplicate Found
*/
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class CheckDuplicates
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		HashSet<Integer> hm = new HashSet<>();
		boolean flag = false;
		for(int i = 0; i < arr.length; i++)
		{
			if(hm.contains(arr[i]))
			{
				flag  = true;
				break;
			}
			hm.add(arr[i]);
		}
		if(flag)
		{
			System.out.println("Duplicate Found");
		}
		else
		{
			System.out.println("No Duplicate");
		}
	}
}