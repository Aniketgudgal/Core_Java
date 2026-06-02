/*
Find Intersection of Two Integer Lists
Description
Return only the integers present in both lists.
*/
import java.util.Scanner;
import java.util.HashSet;
public class IntersectionOfTwoList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of First List: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		System.out.print("Enter the values in first list: ");
		for(int i = 0; i < arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of second list: ");
		size = sc.nextInt();
		int[] arr2 = new int[size];
		System.out.print("Enter the values in second list: ");
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		HashSet<Integer> hm = new HashSet<>();
		for(int i = 0; i < arr1.length; i++)
		{
			hm.add(arr1[i]);
		}
		for(int i = 0; i < arr2.length; i++)
		{
			if(hm.contains(arr2[i]))
			{
				System.out.print(arr2[i]+" ");
			}
		}
	}
}