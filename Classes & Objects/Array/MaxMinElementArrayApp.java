/*
Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
Logic: Loop through array, compare each element, store max.
*/
import java.util.Scanner;
class MaxMinArray
{
	int arr[];
	void inputArray(int arr[])
	{
		this.arr = arr;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the values in array\n");
		for(int i= 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	int findMax()
	{
		int max = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
	
	int findMin()
	{
		int min = arr[0];
		for(int i =0; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}
}
public class MaxMinElementArrayApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		//input size of array
		System.out.printf("Enter the size of array: ");
		int size = xyz.nextInt();
		//create the given size of array
		int arr[] = new int[size];
		
		//create object of class and store in reference variable
		MaxMinArray a1 = new MaxMinArray();
		a1.inputArray(arr);
		int max = a1.findMax();
		System.out.printf("The maximum number in array is: %d\n",max);
		int min = a1.findMin();
		System.out.printf("The minimum number in array is: %d\n",min);
	}
}