//6. Copy One Array into Another
import java.util.Scanner;
public class CopyArray
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] arr= new int[size];
		// insert value in array
		System.out.print("Enter the value in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int result[] = new int[arr.length];
		int j = arr.length - 1;
		for(int i = 0; i <result.length; i++)
		{
			// result[i] = arr[i]; // copy as it is
			result[i] = arr[j]; //copy element in reverse order
			j--;
		}
		
		// print copy array
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(" "+result[i]);
		}
	}
}