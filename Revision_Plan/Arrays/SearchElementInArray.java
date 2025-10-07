//4. Search for an Element in an Array
import java.util.Scanner;
public class SearchElementInArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int num[] = new int[size];
		
		// insert value in array
		System.out.print("Enter the value in array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.print("Enter the search key: ");
		int key = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < num.length; i++)
		{
			if(num[i] == key)
			{
				flag = true;
				break;
			}
		}
		
		String st = flag ? "Search key found, Element is present in array":"Element not found";
		System.out.println(st);
	}
}