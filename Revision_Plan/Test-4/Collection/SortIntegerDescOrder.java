/*
Sort Integers in Descending Order
Description: Arrange integers from largest to smallest.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
class Student
{
	private String name;
	private int id;
	private int rollNo;
	public Student(String name, int id, int rollNo)
	{
		this.name = name;
		this.id = id;
		this.rollNo = rollNo;
	}
	public Student()
	{
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String toString()
	{
		return name+", "+id+", "+rollNo;
	}
}
public class SortIntegerDescOrder
{
	public static void main(String x[])
	{
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Tahir",3,1400));
		al.add(new Student("Aniket",1,400));
		al.add(new Student("Gokul",4,6000));
		al.add(new Student("Omkar",2,7000));
		System.out.println("Before Sorting");
		for(Student s: al)
		{
			System.out.println(s);
		}
		// sort user define object
		Collections.sort(al,(s1,s2) -> s1.getId()< s2.getId() ? 1: s1.getId() > s2.getId() ? -1 : 0);
		System.out.println("After sorting");
		for(Student s: al)
		{
			System.out.println(s);
			
		}
	}
}