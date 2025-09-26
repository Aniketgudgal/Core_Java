/*
Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum.
*/
import java.util.Scanner;
class SumArray
{
	int arr[];
	Scanner sc = new Scanner(System.in);
	void inputArray(int arr[])
	{
		this.arr = arr;
		System.out.println("Enter the values in array");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	int calculateSum()
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}
}
public class SumArrayApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		SumArray s1=new SumArray();
		s1.inputArray(arr);
		int result = s1.calculateSum();
		System.out.printf("The sum of array is: %d",result);
	}
}