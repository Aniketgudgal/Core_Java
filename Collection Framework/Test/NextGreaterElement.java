/*
Q2. Write a java program to for each element, find next greater element to its right using
ArrayList only.
Input: Array: 4 5 2 25
Output:
4 -> 5
5 -> 25
2 -> 25
25 -> -1 
*/
import java.util.Scanner;
import java.util.ArrayList;
public class NextGreaterElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array List: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter values in Array List: ");
		for(int i = 1;  i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		for(int i = 0; i < al.size() - 1; i++)
		{
			boolean flag = false;
			for(int j = i+1; j < al.size(); j++)
			{
				if(al.get(j) > al.get(i))
				{
					System.out.print(al.get(j)+" ");
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				System.out.print(-1+" ");
			}
			if(i == al.size() - 2)
			{
				System.out.print(-1);
			}
		}
	}
}