import java.util.*;
public class DEMO
{
	public static void main(String x[])
	{
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		ArrayList cl = new ArrayList();
		cl.add(100);
		cl.add(300);
		
		boolean result = al.containsAll(cl); // this method returns true when all contains are present in it
		if(result)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
		}
	}
}