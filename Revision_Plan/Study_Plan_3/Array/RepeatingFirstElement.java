/*
Question:
 	Return the first element that repeats in the array.
Input:
arr = {10, 5, 3, 4, 3, 5, 6}
Explanation:
Use a boolean array or nested loops to track seen elements.
Expected Output:
First repeating element is 5
*/
public class RepeatingFirstElement
{
	public static void main(String x[])
	{
		int arr[] = new int[]{10,5,3,4,3,5,6,8,7,9};
		boolean flag = true;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(flag)
			{
				for(int j = i+1; j < arr.length; j++)
				{
					if(arr[i] == arr[j])
					{
						System.out.println("First element repeats in array is: "+arr[i]);
						flag = false;
						break;
					}
				}
			}
			else
			{
				break;
			}
		}
	}
}