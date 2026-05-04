import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
class Student implements Serializable
{
	private int id;
	private String name;
	private int standard;
	public Student()
	{
	}
	public Student(int id, String name, int standard)
	{
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
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
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	public int getStandard()
	{
		return standard;
	}
	public String toString()
	{
		return id+" "+name+" "+standard;
	}
}
public class DeSerializationApp
{
	public static void main(String x[])
	{
		try{
			FileInputStream st = new FileInputStream("D:\\Tech Hub\\github core java\\File Handling\\Stream Classes\\abc.txt");
			ObjectInputStream obj = new ObjectInputStream(st);
			Object result = obj.readObject();
			Student student = (Student)result;
			System.out.println(student);
		}
		catch(Exception e)
		{
			System.out.println("Exception is: "+e);
		}
	}
}