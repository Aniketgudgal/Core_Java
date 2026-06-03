/*
Word Frequency Counter
Description: Count how many times each word appears in a sentence.

Example
Input: java spring java sql spring java
Expected Output:
java=3
spring=2
sql=1
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class FrequencyOfWord
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String input = sc.nextLine();
		String[] word = input.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i = 0; i < word.length; i++)
		{
			Integer count = hm.get(word[i]);
			if(count == null)
			{
				hm.put(word[i],1);
				continue;
			}
			hm.put(word[i], ++count);
		}
		System.out.println("Frequency of word");
		for(Map.Entry<String, Integer> m: hm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}
}