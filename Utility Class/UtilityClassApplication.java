/*
Utility class means class cannot create its object and it contains only static methods and utility class normally used for work as helper class.
How to create a utility class ?
If we want to create a utility class we must declare the class constructor as private and define only static methods in it 
*/
class UtilityClass
{
	private UtilityClass()
	{
		
	}
	static void utilityMethod()
	{
		System.out.println("This method show the utility class example");
	}
}

public class UtilityClassApplication
{
	public static void main(String x[])
	{
		UtilityClass.utilityMethod();
	}
}