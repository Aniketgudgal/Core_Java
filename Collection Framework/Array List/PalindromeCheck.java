/*
Check Palindrome using ArrayList
Problem: Check if elements in an ArrayList form a palindrome.
Example:
Input: [1, 2, 3, 2, 1]
Output: Palindrome
*/
import java.util.Scanner;
import java.util.ArrayList;
public class PalindromeCheck
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array list: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in ArrayList: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.nextInt());
		}
		boolean flag = true;
		int i = 0; 
		int j = al.size() - 1;
		while(i < j)
		{
			if(al.get(i) != al.get(j))
			{
				flag = false;
			}
			i++;
			j--;
		}
		if(flag)
		{
			System.out.println("Array List is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}