/*
Q1. Write a java program to find the element with highest frequency in an integer array using
HashMap.
Input : Array: 1 2 2 3 3 3 4
Output: Element with highest frequency: 3
 Frequency: 3
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class FrequencyOfElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in Array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(Integer a: al)
		{
			Integer val = hm.get(a);
			if(val == null)
			{
				hm.put(a, 1);
				continue;
			}
			hm.put(a, val+1);
		}
		Integer maxKey= Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> mp: hm.entrySet())
		{
			if(mp.getValue() > maxKey)
			{
				maxKey = mp.getKey();
			}
		}
		System.out.println("Highest Frequency is: "+maxKey);
	}
}