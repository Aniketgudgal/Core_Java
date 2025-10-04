/*
Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements.
*/
import java.util.Scanner;
class Average
{
	int arr[];
	public void inputArray(int arr[])
	{
		this.arr = arr;
		// insert value in array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value in array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	public double findAverage()
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		return (sum/arr.length);
	}
}
public class AvgArrayApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		Average a = new Average();
		a.inputArray(arr);
		double avg = a.findAverage();
		System.out.println("The Average of array is: "+avg);
	}
}