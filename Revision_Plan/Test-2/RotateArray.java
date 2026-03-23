/*
Q4. Write a program in java to rotate an array by N positions without using other array.
Input:
The given array is: 0 3 6 9 12 14 18 20 22 25 27
27 25 22 20 18 14 12 9 6 3 0

From 4th position the values of the array are: 12 14 18 20 22 25 27
Before 4th position the values of the array are: 0 3 6 9
After rotating from 4th position the array is: 12 14 18 20 22 25 27 0 3 6 9
*/
import java.util.Scanner;
public class RotateArray
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
		System.out.print("Enter the rotation value: ");
		int r = sc.nextInt();

		// rotate Array logic
		
		rotateArray(arr,r, arr.length - 1);
		rotateArray(arr,0,r-1);
		rotateArray(arr,0, arr.length - 1);
		
		// print array
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void rotateArray(int[] arr, int s, int e)
	{
		while(s < e)
		{
			arr[s] = arr[s] + arr[e];
			arr[e] = arr[s] - arr[e];
			arr[s] = arr[s] - arr[e];
			s++;
			e--;
		}
	}
}