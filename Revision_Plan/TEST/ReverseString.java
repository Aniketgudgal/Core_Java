/*
Q4. Store N strings in an ArrayList. Reverse each string manually and store in another Arraylist.
Input: 3
java, code, list
Output : Reversed List: avaj edoc tsil
Description:
Traverse each string character by character in reverse order. Do not use StringBuilder reverse()
or inbuilt reverse methods.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class ReverseString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		System.out.print("Enter the size of array list: ");
		int size = sc.nextInt();
		System.out.print("Enter the values in Array List: ");
		for(int i = 1; i <= size; i++)
		{
			al.add(sc.next());
		}
		for(int i = 0; i < al.size(); i++)
		{
			String result = reverseString(al.get(i));
			al.set(i, result);
		}
		System.out.print("The result Array list is: ");
		for(int i = 0; i < al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
	}
	public static String reverseString(String s)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = s.length() - 1; i >= 0; i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}