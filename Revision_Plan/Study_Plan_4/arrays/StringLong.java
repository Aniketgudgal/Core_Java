/*
abcabcbb
op:3
*/
import java.util.Scanner;
public class StringLong
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		String s = sc.next();
		int max = 0;
		for(int i = 0; i < s.length(); i++) // abcabcbb
		{
			int[] arr = new int[26]; 
			int count = 0;
			for(int j = i; j < s.length(); j++) 
			{
				if(arr[s.charAt(j) - 'a'] == 0) 
				{
					count++; 
					arr[s.charAt(j) - 'a'] = 1; 
				}
				else
				{
					if(count > max)
					{
						max = count;
					}
					break;
				}
			}
		}
		System.out.println("The max length is: "+max);
	}
}