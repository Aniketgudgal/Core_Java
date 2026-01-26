/*
Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.Scanner;
import java.util.ArrayList;
public class ConvertArrayToArrayList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++)
		{
			al.add(arr[i]);
		}
		System.out.println("The Array List Elements");
		for(Integer a: al)
		{
			System.out.println(a);
		}
	}
}