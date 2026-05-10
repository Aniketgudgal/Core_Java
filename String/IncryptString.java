/*
WAP to input string and incrypt like as?
Example: abcmnoabc
Output: a2b2c2m1n1c1
*/
import java.util.Scanner;
public class IncryptString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string value: ");
		String val = sc.next();
		// freq. Array for each character
		int[] arr = new int[26];
		for(int i = 0; i < val.length(); i++)
		{
			arr[val.charAt(i) - 'a']++;
		}
		// Incrypte String by character by character
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < val.length(); i++)
		{
			if(result.indexOf(val.charAt(i)+"") == -1)
			{
				result.append(val.charAt(i)+""+arr[val.charAt(i)-'a']);
			}
		}
		System.out.println("Incrypted String is: "+result);
	}
}