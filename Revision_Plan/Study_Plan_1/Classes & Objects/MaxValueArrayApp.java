/*
Q3. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.
*/
import java.util.Scanner;
class FindMax
{
	int[] arr; // instance array
	public void setArray(int[] arr)
	{
		this.arr = arr; // set array to instance address
	}
	public int getMax()
	{
		int max = Integer.MIN_VALUE; // store the integer variable min value
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max) // check value is greater than max if yes then store in max variable
			{
				max = arr[i];
			}
		}
		return max; // return max value from array
	}
}
public class MaxValueArrayApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		// declear and initialize an array
		int[] arr = new int[size]; 
		
		//insert value in array
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// create the FindMax class object and call to methods
		FindMax mx = new FindMax();
		mx.setArray(arr);
		int result = mx.getMax();
		System.out.println("The max value in array is: "+result);
	}
}
