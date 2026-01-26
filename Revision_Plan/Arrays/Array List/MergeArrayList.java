/*
Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
public class MergeArrayList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first Array List: ");
		int size = sc.nextInt();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i = 0; i < size; i++)
		{
			al1.add(sc.nextInt());
		}
		System.out.print("Enter the size of second array list: ");
		size = sc.nextInt();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i = 0; i < size; i++)
		{
			al2.add(sc.nextInt());
		}
		ArrayList<Integer> result = new ArrayList<Integer>(al1);
		for(Integer a: al2)
		{
			if(!result.contains(a))
			{
				result.add(a);
			}
		}
		// remove duplicates value from result array list
		for(int i = 0; i < result.size(); i++)
		{
			for(int j = i+1; j < result.size(); j++)
			{
				if(result.get(i).equals(result.get(j)))
				{
					result.remove(j);
				}
			}
		}
		//Collections.sort(result);
		for(int i = 0; i < result.size(); i++)
		{
			for(int j = i+1; j < result.size(); j++)
			{
				if(result.get(i) > result.get(j))
				{
					int temp = result.get(j);
					result.set(j,result.get(i));
					result.set(i, temp);
				}
			}
		}
		System.out.println("The Merge result is: ");
		for(Integer a: result)
		{
			System.out.println(a);
		}
	}
}
