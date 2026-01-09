/*
 Write a Java program to print a given string.
 Input : Hello Java
 Outputt : Hello Java
 */
import java.util.Scanner;
public class StringPrint
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String input = sc.nextLine();
		System.out.println(input);
	}
}