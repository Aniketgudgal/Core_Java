/*
Q4. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array
*/
import java.util.Scanner;
class SortArr
{
	int[] a;
	public void setArray(int[] a)
	{
		this.a = a;
	}
	public int[] getSortArray()
	{
		// selection sort algorithm
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		return a;
	}
}
public class SortArrApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		// insert values in array
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		SortArr s = new SortArr();
		s.setArray(a);
		int[] result = s.getSortArray();
		// print sorted array
		System.out.println("The Sorted array");
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(" "+result[i]);
		}
	}
}