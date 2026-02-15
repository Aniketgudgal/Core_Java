/*
Top K Frequent Elements
Return the k most frequent elements.
Example
Input: [1,1,1,2,2,3], k=2 → [1,2]
*/
import java.util.Scanner;
public class TopKFreqElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the values of K: ");
		int k = sc.nextInt();
		int count = 1;
		int j  = 1;
		while(j < arr.length)
		{
			if(arr[j-1] != arr[j])
			{
				if(count >= k)
				{
					System.out.print(arr[j-1]+" ");
				}
				count = 0;
			}
			count++;
			j++;
		}
	}
}