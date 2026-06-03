/*
Character Frequency Counter
Description: Count how many times each character appears in a string.
Example
Input: banana
Expected Output:
b=1
a=3
n=2
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CharFrequencyCount
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String input = sc.next();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i < input.length(); i++)
		{
			Integer num = hm.get(input.charAt(i));
			if(num != null)
			{
				hm.put(input.charAt(i), ++num);
				continue;
			}
			hm.put(input.charAt(i), 1);
		}
		System.out.println("Frequency of character");
		for(Map.Entry<Character, Integer> m: hm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}
}