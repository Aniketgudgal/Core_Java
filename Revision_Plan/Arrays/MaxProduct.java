/*
Find the maximum product of any two elements in the array.
Example:
 Input: [1, 20, 3, 10, 5]
 Output: 200 (20 × 10)
Hint:
 Find two largest numbers manually using traversal.
*/
import java.util.Scanner;
public class MaxProduct
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int i = 0;
		int j = arr.length - 1;
		while(i < j)
		{
			if(arr[i] * arr[j] > max)
			{
				max = arr[i] * arr[j];
				i++;
				j--;
				continue;
			}
			if(arr[i] > arr[j])
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.println("The max product is: "+max);
	}
}