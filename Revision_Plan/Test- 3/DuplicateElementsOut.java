/*
Q1.Write a Java program to store numbers in ArrayList and print duplicate elements.
Input:[10, 20, 30, 20, 40, 10]
Output: Duplicate Elements : 10 20
*/
import java.util.Scanner;
import java.util.ArrayList;
public class DuplicateElementsOut
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the value in ArrayList: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		ArrayList<Integer> remove = new ArrayList<>();
		System.out.println("After removing duplicates");
		for(int i = 0; i < al.size(); i++)
		{
			Integer n = al.get(i);
			if(!remove.contains(n))
			{
				remove.add(n);
			}
			else
			{
				System.out.print(n + " " );
			}
		}
	}
}