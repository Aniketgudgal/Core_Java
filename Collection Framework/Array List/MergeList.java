/*
Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.Scanner;
import java.util.ArrayList;
public class MergeList
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of first list: ");
		int size = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<>();
		System.out.print("Enter the values in list 1: ");
		for(int i = 1; i <= size; i++)
		{
			list1.add(sc.nextInt());
		}
		System.out.print("Enter the size of second list: ");
		size = sc.nextInt();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.print("Enter the values in second list: ");
		for(int i = 0; i < size; i++)
		{
			list2.add(sc.nextInt());
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i < list1.size(); i++)
		{
			if(!result.contains(list1.get(i)))
			{
				result.add(list1.get(i));
			}
		}
		for(int i = 0; i < list2.size(); i++)
		{
			if(!result.contains(list2.get(i)))
				result.add(list2.get(i));
		}
		System.out.println("Final Result");
		for(Integer al : result)
		{
			System.out.print(al+" ");
		}
	}
}