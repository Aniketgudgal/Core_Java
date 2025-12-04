/*
default value setting using the vector constructor
this constructor having the parameter which set the default incremental value then the vector have to shrink size
*/
import java.util.Vector;
public class ParameterConsVect
{
	public static void main(String x[])
	{
		Vector v = new Vector(5); // this 5 value is show the auto increment by this value
		// the default constructor of vector create the value by default 10, but this parameterize constructor set this as a 5
		System.out.println("The Default value is: "+v.capacity());
	}
}