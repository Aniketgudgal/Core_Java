/*
Find Most Frequent Integer
Description: Identify the integer with the highest frequency.
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class FrequentHighestNumber
{
	public static void main(String x[])
	{
		//take user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int max = 1;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(Integer a: arr)
		{
			Integer count = hm.get(a);
			if(count == null)
			{
				hm.put(a, 1);
				continue;
			}
			count++;
			if(count > max)
			{
				max = count;
			}
			hm.put(a, count);
		}
		System.out.print("Highest Frequency of number are: ");
		for(Map.Entry<Integer, Integer> m: hm.entrySet())
		{
			if(m.getValue() == max)
			{
				System.out.print(m.getKey()+" ");
			}
		}
	}
}