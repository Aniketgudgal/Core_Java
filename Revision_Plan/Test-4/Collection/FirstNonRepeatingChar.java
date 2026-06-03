/*
First Non-Repeating Character
Description: Find the first character that appears only once.
Example
Input: swiss
Expected Output: w
*/
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class FirstNonRepeatingChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String input = sc.next();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(int i = 0; i < input.length(); i++)
		{
			Integer num = hm.get(input.charAt(i));
			if(num == null)
			{
				hm.put(input.charAt(i), 1);
				continue;
			}
			hm.put(input.charAt(i), ++num);
		}
		for(Map.Entry<Character, Integer> m: hm.entrySet())
		{
			if(m.getValue() == 1)
			{
				System.out.println("Non-Repeating character is: "+m.getKey());
				break;
			}
		}
	}
}