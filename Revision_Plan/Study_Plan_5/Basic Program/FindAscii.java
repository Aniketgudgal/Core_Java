/*
Write a Java program to print the ASCII value of a given character
Input:
Character = A

Output:
ASCII value = 65

Explanation:
Every character has a unique ASCII value. When a character is typecast to an integer, its ASCII value is obtained. The ASCII value of 'A' is 6
*/
import java.util.Scanner;
public class FindAscii
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		System.out.println("ASCII of "+ch+" is: "+((int)(ch)));
	}
}