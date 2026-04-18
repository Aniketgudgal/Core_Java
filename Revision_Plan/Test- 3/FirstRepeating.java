/*
Q1. Write a Java program using JDK 1.8 Stream API to find the first repeating integer
from a given array.
If no element repeats, print No Repetition Found.
The first repeating element means the element whose second occurrence appears first
while traversing from left to right.
Description
• Accept integer array from user.
• Use Stream API / Lambda Expression.
• Detect duplicate values.
• Return first repeating element.
Input
Enter size: 8
Enter elements:
4 7 2 9 7 5 2 1
Output
First Repeating Element: 7
Explanation
• 7 repeats before 2 repeats.
• Therefore answer is 7.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class FirstRepeating
{
	public static void main(String x[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> al = arr.toArray();
		
	}
}