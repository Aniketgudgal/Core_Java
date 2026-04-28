import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTrimOp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Data is: "+al);
		boolean result = al.removeIf((v) -> v % 2 == 0);
		System.out.println(result);
		System.out.println("updated List");
		System.out.println(al);
	}
}