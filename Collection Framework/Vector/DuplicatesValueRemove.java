/*
remove duplicates
*/
import java.util.*;
public class DuplicatesValueRemove
{
	public static void main(String x[])
	{
		Vector v = new Vector();
		v.add(40);
		v.add(20);
		v.add(40);
		v.add(90);
		v.add(30);
		System.out.println(v);
		for(Object obj: v)
		{
			int count = 0;
			for(Object xyz: obj)
			{
				if(v.get(obj) == v.get(xyz))
				{
					count++;
				}
			}
			if(count > 1)
			{
				v.remove((int)obj);
			}
		}
	}
}