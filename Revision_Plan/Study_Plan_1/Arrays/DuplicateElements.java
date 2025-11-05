//10. Remove Duplicate Elements from Array
import java.util.Scanner;
import java.util.Arrays;
public class DuplicateElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the values in array");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println("Array is sorted");
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(" "+num[i]);
		}
		
		// remove duplicates elemenet from sorted array
		int j = 0;
		for(int i = 1; i < num.length; i++)
		{
			if(num[i] != num[j])
			{
				++j;
				num[j] = num[i];
			}
			
		}
		
		System.out.println("\nAfter Removing duplicates");
		for(int i = 0; i <= j; i++)
		{
			System.out.print(" "+num[i]);
		}
	}
}
