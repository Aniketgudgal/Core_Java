/*
Integer Frequency Counter
Description: Count occurrences of each integer in a list.
*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class FrequencyNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of List: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the values in list: ");
		for(int i = 0; i < size; i++)
		{
			al.add(sc.nextInt());
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(Integer a: al)
		{
			Integer num = hm.get(a);
			if(num == null)
			{
				hm.put(a, 1);
				continue;
			}
			hm.put(a,++num);
		}
		System.out.println("Frequency of Digit");
		for(Map.Entry<Integer, Integer> h: hm.entrySet())
		{
			System.out.println(h.getKey()+": "+h.getValue());
		}
	}
}