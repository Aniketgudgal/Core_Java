/*
Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;
public class SortingVector
{
	public static void main(String x[])
	{
		ArrayList a = new ArrayList(49);
		a.add(10);
		a.add(20);
		int cp = a.capacity();
		System.out.println("size of Array List: "+a.size());
		System.out.println("capacity of array list: "+cp);
	}
}