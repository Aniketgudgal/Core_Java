/*
First Non-Repeating Word
Description: Find the first word that appears only once in a sentence.
*/
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingWord
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String input: ");
		String input = sc.nextLine();
		String[] word = input.split(" ");
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
		for(int i = 0; i < word.length; i++)
		{
			Integer count = hm.get(word[i]);
			if(count == null)
			{
				hm.put(word[i], 1);
				continue;
			}
			hm.put(word[i], ++count);
		}
		for(Map.Entry<String, Integer> m: hm.entrySet())
		{
			if(m.getValue() == 1)
			{
				System.out.println("First Non-Repeating Word is: "+m.getKey());
				break;
			}
		}
	}
}