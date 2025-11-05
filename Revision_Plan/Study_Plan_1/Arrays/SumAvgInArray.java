//3. Calculate the Sum and Average of Elements
import java.util.Scanner;
public class SumAvgInArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		// insert values in array
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		// calculate sum and average
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		int avg = sum/arr.length;
		
		System.out.println("The sum of all element is: "+sum);
		System.out.println("The Average of all element is: "+avg);
	}
}