/*
Find Even Numbers in ArrayList
Problem: Extract all even numbers from an ArrayList into another list.
Example:
Input: [1, 2, 3, 4, 5]
Output: [2, 4]
*/
import java.util.ArrayList;
import java.util.List;
public class EvenElements
{
	public static void main(String x[])
	{
		List<Integer> list = List.of(1,2,3,4,5);
		ArrayList<Integer> al = new ArrayList<>(list);
		ArrayList<Integer> newList = new ArrayList<>();
		for(Integer a: al)
		{
			if(a % 2 == 0)
			{
				newList.add(a);
			}
		}
		System.out.println("New List is: "+newList);
	}
}