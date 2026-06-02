/*
Count Unique Integers
Description
Determine the number of unique integers in a list.
*/
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class CountUniqueIntegers
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in list: ");
		for(int i = 0; i < size; i++)
		{
			al.add(sc.nextInt());
		}
		int count = 0;
		HashSet<Integer> hm = new HashSet<>();
		for(Integer a: al)
		{
			hm.add(a);
		}
		System.out.println("The Unique Elements Are: "+((al.size()+ hm.size()) - al.size()));
	}
}