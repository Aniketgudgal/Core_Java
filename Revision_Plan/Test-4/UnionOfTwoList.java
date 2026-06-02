/*
Find Union of Two Integer Lists
Description
Create a collection containing all unique integers from both lists.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class UnionOfTwoList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of First List: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in first list: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the second list size: ");
		size = sc.nextInt();
		int[] arr2 = new int[size];
		System.out.print("Enter the values in second list: ");
		for(int i =0; i < arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		HashSet<Integer> hm = new HashSet<>();
		for(int i = 0; i < arr.length; i++)
		{
			hm.add(arr[i]);
		}
		for(int i = 0; i < arr2.length; i++)
		{
			hm.add(arr2[i]);
		}
		System.out.println("Union is: ");
		for(Integer a: hm)
		{
			System.out.print(a+" ");
		}
	}
}