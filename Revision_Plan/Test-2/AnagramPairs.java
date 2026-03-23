/*
Q9. Write a Java program to find all anagram pairs.
Description: Find anagram pairs from list.
Input: Enter words: cat tac act dog god
Output:
cat tac
cat act
tac act
dog god
*/
import java.util.Scanner;
public class AnagramPairs
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.print("Enter the values: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.next();
		}
		System.out.println("Pairs are: ");
		for(int i = 0; i < arr.length - 1; i++)
		{
			String check = accendingString(arr[i]);
			for(int j = i+1; j < arr.length; j++)
			{
				String check2 = accendingString(arr[j]);
				if(check.equals(check2))
				{
					System.out.println(arr[i] + " "+arr[j]);
				}
			}
		}
	}
	public static String accendingString(String a)
	{
		char[] ch = a.toCharArray();
		for(int i = 0; i < ch.length - 1; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] > ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}
}