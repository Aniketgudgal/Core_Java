/*
Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int key)
Logic: Traverse array, check if key matches any element.
*/
import java.util.Scanner;
class Search
{
	int arr[];
	public void inputArray(int arr[])
	{
		this.arr = arr;
		// insert value in array
		System.out.println("Enter the values in array");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public boolean searchElement(int key)
	{
		boolean flag = false;
		// check the key in array
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == key)
				flag = true;
		}
		if(flag)
			return true;
		else
			return false;
	}
}
public class SearchElementInArrayApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// create the array
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		// create object and call methods
		Search s = new Search();
		s.inputArray(arr);
		System.out.print("Enter the search key: ");
		int key = sc.nextInt();
		// pass key to searchElement() method
		boolean result = s.searchElement(key);
		
		// check condition
		if(result)
			System.out.println("search key present in array");
		else
			System.out.println("Search key not found");
	}
}