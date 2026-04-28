/*
Sum of Elements in ArrayList
Problem: Calculate the sum of all elements in an ArrayList.
Example:
Input: [1, 2, 3, 4]
Output: 10
*/
import java.util.Scanner;
import java.util.ArrayList;
public class SumElements
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
		int sum = 0;
		for(Integer a: al)
		{
			sum += a;
		}
		System.out.println("Sum is: "+sum);
	}
}