/*
Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/
import java.util.Scanner;
public class EvenOddElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int odd = 0;
		int even = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("The even elements in array are: "+even+"\n"+"The odd elements in array are: "+odd);
	}
}