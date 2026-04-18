/*
Q3. Write a Java program to count all triplets (i, j, k) such that:
• i < j < k
• arr[i] + arr[j] + arr[k] < target
Description :-
You need to count total valid combinations of three different indexes.
Input
• First line contains integer n
• Second line contains n integers
• Third line contains integer target
Output :-
Print total count of triplets.
Input - 5 1 3 4 7
 12
Output - 4
Explanation
Valid triplets:
• (1,3,4) = 8
• (1,3,5) = 9
• (1,4,5) = 10
• (1,3,7) = 11
Total = 4
*/
import java.util.Scanner;
public class countAllTriplets
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the value in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the target value: ");
		int target = sc.nextInt();
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				for(int k = j + 1; k < arr.length; k++)
				{
					if((arr[i] + arr[j] + arr[k]) < target)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
					}
				}
			}
		}
		System.out.println("The Count is: "+count);
	}
}