/*
Q3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to create child class name as GetSum with method int getArrSum() you have to accept array values from ArrSum and calculate its sum and return it
*/
import java.util.Scanner;
class ArrSum
{
	int arr[];
	void setValue(int arr[])
	{
		this.arr = arr;
	}
}
class GetSum extends ArrSum
{
	int getArrSum()
	{
		int sum = 0;
		//logic of calculation of sum 
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
	}
}
public class ArraySumApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		GetSum gt = new GetSum();
		gt.setValue(arr);
		
		int	sum = gt.getArrSum();
		System.out.println("The Sum of Array is: "+sum);
	}
}