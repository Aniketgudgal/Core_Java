/*
16. Generate Multiplication Table
Create a class MultiplicationTable with a method printTable to print the table of a given number.
Explanation: Explains nested loops and formatted printing.
*/
import java.util.Scanner;
class MultiplicationTable
{
	// using recursion
	void printTable(int n,int i)
	{
		if(i == 11)
		{
			return ;
		}
		System.out.printf(" %d",n*i);
		printTable(n,i+1);
	}
	
	//using loop
	
	
}
public class TableRecursionApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		MultiplicationTable t1 = new MultiplicationTable();
		t1.printTable(num,1);
	}
}