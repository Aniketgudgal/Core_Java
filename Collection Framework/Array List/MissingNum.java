/*
Find Missing Number
Problem: Given numbers from 1 to N in an ArrayList with one missing, find the missing
number.
Example:
Input: [1, 2, 4, 5]
Output: 3
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class MissingNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		ArrayList<Integer>al =  new ArrayList<>();
		System.out.print("Enter the values in array list: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		Collections.sort(al);
		for(int i = 0; i < al.size() - 1; i++)
		{
			if(al.get(i+1) - al.get(i) > 1)
			{
				int j = al.get(i)+1;
				while(j < al.get(i+1))
				{
					System.out.print(j+" ");
					j++;
				}
			}
		}
	}
}