/*
Q3. Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.
*/
import java.util.Scanner;
class FindMax
{
	int[] a;
	void setArray(int a[])
	{
		this.a = a;
	}
	
	int getMax()
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		return max;
	}
}
public class MAXFinderApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the value in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		FindMax m = new FindMax();
		m.setArray(arr);
		int result = m.getMax();
		System.out.println("The max element in array is: "+result);
	}
}