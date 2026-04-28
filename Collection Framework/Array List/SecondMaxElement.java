/*
 Find Second Largest Element
Problem: Find the second largest element in an ArrayList.
Example:
Input: [10, 20, 4, 45, 99]
Output: 45
*/
import java.util.ArrayList;
import java.util.Scanner;
public class SecondMaxElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the value in array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(Integer a: al)
		{
			if(a > max)
			{
				secondMax = max;
				max = a;
			}
			else if(a > secondMax && a < max)
			{
				secondMax = a;
			}
		}
		System.out.println("Second max is: "+secondMax);
	}
}