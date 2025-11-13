/*
Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and we have to create three child classes name as Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() function return division of two values which Is inherited from Value class.
*/
import java.util.Scanner;
class Value
{
	int a,b;
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int getResult()
	{
		return 0;
	}
}
class Add extends Value
{
	int getResult()
	{
		return a+b;
	}
}
class Mul extends Value
{
	int getResult()
	{
		return a*b;
	}
}
class Div extends Value
{
	int getResult()
	{
		return a/b;
	}
}
class OperationOP{
	void operationResult(Value v)
	{
		System.out.println(v.getResult());
	}
}
public class Operation
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second value: ");
		int b = sc.nextInt();
		
		OperationOP op = new OperationOP();
		Value v = null;
		v = new Add();
		v.setValue(a,b);
		op.operationResult(v);
	
		v = new Mul();
		v.setValue(a,b);
		op.operationResult(v);
		
	}
}
