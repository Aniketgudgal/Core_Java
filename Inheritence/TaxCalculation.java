/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.


EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.


Explanation:
 Tests inheritance where logic changes depending on product type.
*/
import java.util.Scanner;
class Product
{
	int id;
	String name;
	int basePrice;
}
class LuxuryProduct extends Product
{
	LuxuryProduct(int id, String name, int basePrice)
	{
		this.id = id;
		this.name = name;
		this.basePrice = basePrice;
	}
	int rate = 20;
	float tax;
	void calculateTax()
	{
		tax = (rate*basePrice)/100;
	}
	
	void displayTax()
	{
		System.out.println("The Tax on Luxury Product is: "+tax);
	}
}
class EssentialProduct extends Product
{
	EssentialProduct(int id, String name, int basePrice)
	{
		this.id = id;
		this.name = name;
		this.basePrice = basePrice;
	}
	int rate = 5;
	float tax;
	void calculateTax()
	{
		tax = (rate*basePrice)/100;
	}
	void displayTax()
	{
		System.out.println("The Tax on Essential Product is: "+tax);
	}
}

public class TaxCalculation
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choice the Producta 1. Luxury Product 2. Essential Product");
		int choice = sc.nextInt();
		System.out.print("Enter the product id: ");
		int id = sc.nextInt();
		System.out.print("Enter name of Product: ");
		String name = sc.next();
		System.out.print("Enter the price: ");
		int price = sc.nextInt();
		if(choice == 1)
		{
			LuxuryProduct l1 = new LuxuryProduct(id,name,price);
			l1.calculateTax();
			l1.displayTax();
		}
		else
		{
			EssentialProduct e1 = new EssentialProduct(id,name,price);
			e1.calculateTax();
			e1.displayTax();
		}
	}
}