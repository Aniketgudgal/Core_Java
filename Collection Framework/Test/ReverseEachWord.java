/*
Q3. Write a java program to store each word of a sentence into an ArrayList and reverse each
word individually.
Input: java is powerful
Output: avaj si lufrewop
*/
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseEachWord
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String input: ");
		String n = sc.nextLine();
		String[] sp = n.split(" ");
		ArrayList<String> al = new ArrayList<>();
		for(String s: sp)
		{
			al.add(s);
		}
		for(int i = 0; i < al.size(); i++)
		{
			String result = reverseWord(al.get(i));
			al.set(i,result);
		}
		System.out.println("Result");
		for(String s: al)
		{
			System.out.print(s+" ");
		}
	}
	public static String reverseWord(String s)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = s.length() - 1; i >= 0; i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}