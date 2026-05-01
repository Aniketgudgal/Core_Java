/*
Q5. Write a java program to store list of strings in ArrayList and sort them based on string
length.
Input : apple banana kiwi mango
Output:
kiwi
apple
mango
banana 
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class StringStoreLength
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String s = sc.nextLine();
		String[] spt = s.split(" ");
		ArrayList<String> al = new ArrayList<>();
		for(String st: spt)
		{
			al.add(st);
		}
		for(int i = 0; i < al.size() - 1; i++)
		{
			for(int j = i+1; j < al.size(); j++)
			{
				String first = al.get(i);
				String second = al.get(j);
				if(first.length() > second.length())
				{
					al.set(i, second);
					al.set(j, first);
				}
			}
		}
		for(String st: al)
		{
			System.out.println(st);
		}
	}
}