import java.util.Scanner;
public class ExceptionHandling
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[];
		try
		{
			arr = new int[size];
			System.out.print("Enter the values in array: ");
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i < arr.length; i++)
			{
				sum+= arr[i];
			}
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Size of negative not allowed: "+e);
			System.out.println("Enter the positive value: ");
			size =sc.nextInt();
			arr = new int[size];
			System.out.print("Enter the values in array: ");
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i < arr.length; i++)
			{
				sum+= arr[i];
			}
		}
		finally
		{
		{
			System.out.println("The Sum is: "+sum);
		}
	}
}