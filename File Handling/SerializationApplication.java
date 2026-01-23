import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Employee
{
	private String name;
	private int salary;
	private int id;
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
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
public class SerializationApplication
{
	public static void main(String x[])
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Aniket");
		e1.setSalary(5000);
		// reading the file from drive
		FileOutputStream fe = new FileOutputStream("D:\\Tech Hub\\github core java\\File Handling\\serilazation.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fe);
		obj.writeObject(e1);
		fe.close();
		obj.close();
	}
}