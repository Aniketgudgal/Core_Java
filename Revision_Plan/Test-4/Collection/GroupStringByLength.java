/*
Group Strings by Length
Description: Group strings according to their length.
Example
Input: ["Java","SQL","Spring","AWS"]
Expected Output:
3 -> [SQL,AWS]
4 -> [Java]
6 -> [Spring]
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class GroupStringByLength
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		String[] input = new String[size];
		System.out.print("Enter the values: ");
		for(int i = 0; i < size; i++)
		{
			input[i] = sc.next();
		}
		HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
		for(int i = 0; i < input.length; i++)
		{
			ArrayList<String> list = hm.get(input[i].length());
			if(list == null)
			{
				ArrayList<String> al = new ArrayList<>();
				al.add(input[i]);
				hm.put(input[i].length(), al);
				continue;
			}
			list.add(input[i]);
			hm.put(input[i].length(), list);
		}
		for(Map.Entry<Integer, ArrayList<String>> m: hm.entrySet())
		{
			System.out.print(m.getKey()+": ");
			for(String s: m.getValue())
			{
				System.out.print(s+" ");
			}
			System.out.println();
		}		
	}
}