/*
 Write a program to count the number of vowels in a string.
 Input : Education
 Output : 5
*/
import java.util.Scanner;
public class VowelsInString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String in = sc.nextLine();
		int count = 0;
		for(int i = 0; i < in.length(); i++)
		{
			if(in.charAt(i) == 'A' || in.charAt(i) == 'O' || in.charAt(i) == 'E'||in.charAt(i) == 'I' || in.charAt(i) == 'U')
				count++;
			else if(in.charAt(i) == 'a' || in.charAt(i) == 'o' || in.charAt(i) == 'e'||in.charAt(i) == 'i' || in.charAt(i) == 'u')
				count++;
		}
		System.out.println("The Total Vowels in String is: "+count);
	}
}