/*
Two Sum
Problem:
Given an array of integers and a target, return indices of two numbers such that they add up to the
target.
Example:
Input → nums = [2, 7, 11, 15], target = 9
Output → [0, 1]
*/
import java.util.Scanner;
import java.util.HashMap;
public class TwoSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i =0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < arr.length; i++)
		{
			Integer v = target - arr[i];
			if(!hm.containsKey(v))
			{
				hm.put(arr[i], i);
			}
			else
			{
				System.out.println("Indexes are: "+hm.get(v) + ", "+i);
				break;
			}
		}
	}
}