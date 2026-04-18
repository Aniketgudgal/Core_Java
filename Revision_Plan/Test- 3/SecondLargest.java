/*
Q1. Write a Java program to find the second largest distinct element in an integer array.
 If the second largest distinct element does not exist, print -1.
Description :-The array may contain duplicate values. You must consider only distinct
numbers.
 Input :-
• First line contains integer n
• Second line contains n space-separated integers
 Output :- Print the second largest distinct element.
 Input - 7 3 9 9 5 7
 Output - 7
 Explanation :-
Distinct elements = {3,5,7,9}
Second largest = 7
*/
import java.util.Scanner;
public class SecondLargest
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < num.length; i++)
		{
				num[i] = sc.nextInt();
		}
		int itrIndex = sortDuplicateRemove(num);
		int result = secondLargest(num, itrIndex);
		System.out.println("The Second Largest Element is: "+result);
	}
	public static int sortDuplicateRemove(int[] num)
	{
		for(int i = 0; i < num.length; i++)
		{
			for(int j = i + 1; j < num.length; j++)
			{
				if(num[i] > num[j])
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		int i = 0;
		int j = i+1;
		while(j <  num.length)
		{
			if(num[i] == num[j])
			{
				j++;
			}
			else
			{
				i++;
				num[i] = num[j];
			}
		}
		return i;
	}
	public static int secondLargest(int[] num, int index)
	{
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i <= index; i++)
		{
			if(num[i] > secondMax && num[i] < max)
			{
				secondMax = num[i];
			}
			else if(num[i] > max)
			{
				secondMax = max;
				max = num[i];
			}
		}
		return secondMax;
	}
}