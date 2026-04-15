/*
 Intersection of Two Arrays
Problem:
Find common elements between two arrays.
Example:
Input → [1,2,2,1], [2,2]
Output → [2]
*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class IntersectionOfTwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first array size: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the second size: ");
		size = sc.nextInt();
		int[] arr2 = new int[size];
		System.out.print("Enter the values in second array: ");
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for(int i = 0; i < arr1.length; i++)
		{
			 hm.put(arr1[i], false);
		}
		System.out.println("Intersection of Following Elements");
		for(int i = 0; i < arr2.length; i++)
		{
			Boolean res = hm.get(arr2[i]);
			if(hm.containsKey(arr2[i]) && (!res))
			{
				System.out.print(arr2[i]+" ");
				hm.put(arr2[i], true);
			}
		}
		
	}
}