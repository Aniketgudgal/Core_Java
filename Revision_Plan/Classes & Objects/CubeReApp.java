/*
Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it.
*/
import java.util.Scanner;
class CubeRe
{
	int x;
	public void setValue(int x)
	{
		this.x = x;
	}
	public int getCube()
	{
		return (x*x*x);
	}
}
public class CubeReApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		CubeRe c = new CubeRe();
		c.setValue(num);
		int cube = c.getCube();
		System.out.println("The Cube is: "+cube);
	}
}