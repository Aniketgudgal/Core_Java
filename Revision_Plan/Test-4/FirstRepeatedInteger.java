/*
Find First Repeated Integer
Description
Identify the first integer that appears more than once.
*/
import java.util.Scanner;
import java.util.HashSet;
public class FirstRepeatedInteger
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		HashSet<Integer> hm = new HashSet<>();
		boolean flag = true;
		for(int i = 0; i < arr.length; i++)
		{
			if(hm.contains(arr[i]))
			{
				System.out.println("First Duplicate Element: "+arr[i]);
				flag = false;
				break;
			}
			hm.add(arr[i]);
		}
		if(flag)
		{
			System.out.println("There is no such Element exist");
		}
	}
}