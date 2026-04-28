/*
Count Occurrence of Element
Problem: Count how many times a specific number appears in an ArrayList.
Example:
Input: [1, 2, 2, 3, 2], target = 2
Output: 3
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CountOccurrence
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.print("Enter target value: ");
		int target = sc.nextInt();
		int count = 0;
		for(Integer a: al)
		{
			if(a == target)
			{
				count++;
			}
		}
		System.out.println("The count is: "+count);
	}
}