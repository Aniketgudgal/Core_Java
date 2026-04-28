/*
Reverse Elements in ArrayList
Problem: Reverse the elements stored in an ArrayList.
Example:
Input: [1, 2, 3, 4]
Output: [4, 3, 2, 1]
*/
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Before reverse");
		System.out.println(al);
		int i = 0;
		int j = al.size() - 1;
		while(i < j)
		{
			Integer v  = al.get(i);
			al.set(i, al.get(j));
			al.set(j, v);
			i++;
			j--;
		}
		System.out.println("After reverse");
		System.out.println(al);
	}
}