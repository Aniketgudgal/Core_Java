/*
7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/
import java.util.Scanner;
public class IntersectionTwoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take the first array size
		System.out.print("Enter the first array size: ");
		int size1 = sc.nextInt();
		// take the second array value
		System.out.print("Enter the second array size: ");
		int size2 = sc.nextInt();
		int[] num1 = new int[size1];
		int[] num2 = new int[size2];
		// take the input from user for first array
		System.out.println("Enter the values in first array");
		for(int i = 0; i < num1.length; i++)
		{
			num1[i] = sc.nextInt();
		}
		// take the input from user for second array
		for(int i = 0; i < num2.length; i++)
		{
			num2[i] = sc.nextInt();
		}
		int k = 0;
		int p = 0;
		if(num1.length > num2.length)
		{
			while(k < num2.length)
			{
				if(num1[k] == num2[p])
				{
					System.out.print(" "+num1[k]);
					k++;
					p++;
				}
				else if(num1[k] > num2[p])
				{
					p++;
					
				}
				else
				{
					k++;
				}
			}
		}
		else
		{
			while(p < num1.length)
			{
				if(num1[k] == num2[p])
				{
					System.out.print(" "+num1[k]);
					k++;
					p++;
				
				}
				else if(num1[k] > num2[p])
				{
					p++;
				}
				else
				{
					k++;
				}
			}
		}
	}
}