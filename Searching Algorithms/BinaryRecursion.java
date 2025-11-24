/*
Binary search algorithm using recursion
*/
public class BinaryRecursion
{
	public static void main(String x[])
	{
		int[] num = {1,2,3,4,5}; 
		int key = 8;
		int result = binarySearch(num, 0, num.length - 1, key);
		if(result != -1)
		{
			System.out.println("The Element is present in array");
		}
		else
		{
			System.out.println("The Element is not present in array");
		}
	}
	static int binarySearch(int num[], int start, int end, int key)
	{
		if(start > end)
		{
			return -1;
		}
		int mid  = start + (end - start)/2;
		if(num[mid] == key)
		{
			return mid;
		}
		if(num[mid] < key)
		{
			return binarySearch(num, (start = mid + 1), end, key);
		}
		else
		{
			return binarySearch(num, start , (end = mid - 1), key);
		}
	}
}