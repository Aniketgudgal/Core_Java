/*
Remove Duplicate Elements (ArrayList Only)
Problem: Remove duplicate values from an ArrayList without using Set.
Example:
Input: [1, 2, 2, 3, 4, 4]
Output: [1, 2, 3, 4]
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DuplicateRemove
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		Collections.sort(al);
		System.out.print("Enter the values in array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		int i = 0;
		int j = 0;
		while(j < al.size())
		{
			if((al.get(i) != null && al.get(j) != null) && (al.get(i) != al.get(j)))
			{
				i++;
				al.set(i, al.get(j));
			}
			j++;
		}
		j = al.size() - 1;
		while(j > i)
		{
			al.remove(j);
			j--;
		}
		System.out.println("After removing duplicates: "+al);
	}
}