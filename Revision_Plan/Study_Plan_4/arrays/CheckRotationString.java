/*
String Rotation Check
Given two strings s1 and s2, check if s2 is a rotation of s1.
Example
Input: "waterbottle", "erbottlewat" → true
*/
import java.util.Scanner;
public class CheckRotationString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String s1 = sc.next();
		System.out.print("Enter the second String: ");
		String s2 = sc.next();
		if(s1.length() == s2.length() && (s1+s1).contains(s2))
		{
			System.out.println("String is in rotation");
		}
		else
		{
			System.out.println("not rotation");
		}
	}
}