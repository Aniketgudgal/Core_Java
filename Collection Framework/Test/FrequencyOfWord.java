/*
Q4. Write a java program to given a sentence, count frequency of each word using HashMap.
Input : java is easy java is powerful
Output: java=2
 is=2
 easy=1
 powerful=1
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class FrequencyOfWord
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string input: ");
		String s = sc.nextLine();
		String[] spt = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for(String ip : spt)
		{
			Integer val = hm.get(ip);
			if(val == null)
			{
				hm.put(ip, 1);
				continue;
			}
			hm.put(ip, val+1);
		}
		System.out.println("Frequency Of Each Word");
		for(Map.Entry<String, Integer> mp: hm.entrySet())
		{
			System.out.println(mp.getKey()+"  "+mp.getValue());
		}
	}
}
