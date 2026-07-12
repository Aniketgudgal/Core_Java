/*
Sort Employee Names in Reverse Order
Description: Sort names from Z to A.
*/
import java.util.ArrayList;
import java.util.Collections;
//pojo  class
class Student implements Comparable<Student>
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
	
	public int compareTo(Student s)
	{
		return s.getName().compareTo(this.name);
	}
}
public class SortDescObj
{
	public static void main(String x[])
	{
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("Shivam",1,10));
		al.add(new Student("Gokul",2,20));
		al.add(new Student("Aniket",3,14));
		al.add(new Student("Tahir", 4,13));
		System.out.println("Before Sorting");
		for(Student s: al)
		{
			System.out.println(s);
		}
		Collections.sort(al);
		System.out.println("After Sorting");
		for(Student s: al)
		{
			System.out.println(s);
		}
	}
}