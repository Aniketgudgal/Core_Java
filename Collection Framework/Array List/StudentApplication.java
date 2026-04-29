/*
 Sort Students by Marks (Comparable)
Problem: Create a Student object (id, name, marks) and sort students in ascending order of
marks using natural ordering.
Example:
Input: [70, 85, 60]
Output: [60, 70, 85]
*/
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Student implements Comparable
{
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student(){}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	public int getMarks()
	{
		return marks;
	}
	public int compareTo(Object o)
	{
		Student st = (Student)o;
		return st.getMarks() < this.getMarks() ? 1 : st.getMarks() > this.getMarks() ? -1 : 0;
	}
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
}
public class StudentApplication
{
	public static void main(String x[])
	{
		List<Student> s = new ArrayList<>(List.of(new Student(4,"ABC",70), new Student(3,"PSW",85), new Student(1,"JAK",60)));
		Collections.sort(s);
		for(Student a: s)
		{
			System.out.println(a);
		}
	}
}