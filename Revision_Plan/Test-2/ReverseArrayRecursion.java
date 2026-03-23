/*
Q2. Write a program to reverse an array using recursion.
Input:
Array:
10 20 30 40 50
Output:
Reversed Array:
50 40 30 20 10
*/
import java.util.Scanner;
public class ReverseArrayRecursion
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
		reverseArray(arr,0);
		// print array
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverseArray(int[] arr, int i)
	{
		if(i >= arr.length/ 2)
		{
			return;
		}
		else
		{
			int j = (arr.length - 1) - i;
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
			i++;
			reverseArray(arr,i);
		}
	}
}