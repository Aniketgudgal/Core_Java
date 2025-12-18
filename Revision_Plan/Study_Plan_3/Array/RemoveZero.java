/*
1. Problem:
Move all 0’s to the end of the array without changing the order of non-zero elements.
Input: arr = [0, 1, 0, 3, 12]
Output: arr = [1, 3, 12, 0, 0]
*/
public class RemoveZero
{
	public static void main(String x[])
	{
		int arr[] = new int[]{0,0,0,0,0,0,1,0,0,0,0,3,0,12,0};
		int j = arr.length - 1;
		for(int i = 0; i < j;)
		{
			if(arr[i] == 0) // checking the if zero is present or not
			{
				int k = i; 
				while(k < j) // goes to the last index swapping the number and zero goes to last
				{
					arr[k] = arr[k] + arr[k+1];
					arr[k+1] = arr[k]  - arr[k+1];
					arr[k] = arr[k] - arr[k+1];
					k++;
				}
				j--; // shifting last index by -1
			}else
			{
				i++; // if current index not having zero then and then shifting index by 1
			}
		}
		// print final array
		for(int i= 0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
