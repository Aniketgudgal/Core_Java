/*
Q7. Write a program to enter the String and sum of the all Digits in a given String
 input : abcd123pqe12mn12abc
 output is Sum is 147
 (note sum of number is 123+12+12 =147)
*/
import java.util.Scanner;
public class DigitSum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String input: ");
		String input = sc.next();
		input += "a";
		StringBuffer sum = new StringBuffer();
		int total = 0;
		for(int i = 0; i < input.length() - 1; i++)
		{
			if((input.charAt(i) >= '0' && input.charAt(i) <= '9') && (input.charAt(i+1) >= 'a' && input.charAt(i+1) <= 'z') )
			{
				sum.append(input.charAt(i));
				total += Integer.parseInt(new String(sum));
				sum.setLength(0);
			}
			else if(input.charAt(i) >= '0' && input.charAt(i) <= '9')
			{
				sum.append(input.charAt(i));
			}
		}
		System.out.println("sum of number is: "+total);
	}
}