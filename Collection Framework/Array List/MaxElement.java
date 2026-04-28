/*
Find Maximum Element using ArrayList
Problem: Store integers in an ArrayList and find the maximum element.
Requirement: Do not use array.
Example:
Input: [3, 7, 2, 9, 5]
Output: 9
*/
import java.util.ArrayList;
import java.util.Scanner;
public class MaxElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the value in list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		Integer max = 0;
		for(Integer a: al)
		{
			if(a > max)
			{
				max = a;
			}
		}
		System.out.println("Max value is: "+max);
	}
}