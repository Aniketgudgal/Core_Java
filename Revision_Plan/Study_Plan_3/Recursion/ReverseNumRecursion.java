import java.util.Scanner;
public class ReverseNumRecursion
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// taking array size from user
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		// inserting value in array from user
		System.out.print("Enter the elements in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		reverseNumber(arr,0); // calling reverse function to reverse the array
		// print the result array
		System.out.println("Result Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	// this function is reverse the array by using recursion
	public static void reverseNumber(int[] arr, int i)
	{
		if(i >= (arr.length /2)) // checking the half of array size
		return; // if pointer goes to half of array then stop the recursion
		else
		swap(arr,i, (arr.length - i - 1)); // swap the first and last number
		reverseNumber(arr,i+1); // calling itself
	}
	// this function is swapping the number
	public static void swap(int[] arr, int start, int end)
	{
		arr[start] = arr[start] + arr[end];
		arr[end] = arr[start] - arr[end];
		arr[start] = arr[start] - arr[end];
	}
}