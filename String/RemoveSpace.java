/*
Q16. Write a program to remove all spaces from a string.
 Input : Java Programming
 Output : JavaProgramming
*/
import java.util.Scanner;
public class RemoveSpace
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input of string type: ");
		String in = sc.nextLine();
		char[] al = in.toCharArray();
		int count = 0;
		for(int i = 0; i < al.length;)
		{
			if(al[i] == 32)
			{
				count++;
				int len = al.length - count;
				int j = i;
				while(j < len)
				{
					al[j] = al[j+1];
					j++;
				}
			}
			else
			{
				i++;
			}
		}
		String result = new String(al,0,al.length - count);
		System.out.println("The Result string is: "+result);
	}
}