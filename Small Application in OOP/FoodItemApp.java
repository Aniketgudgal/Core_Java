/*
6. Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
 This helps understand comparison logic with custom objects.
*/
import java.util.Scanner;
class FoodItem
{
	private String foodName;
	private int price;
	void setFoodName(String name)
	{
		foodName = name;
	}
	String getFoodName()
	{
		return foodName;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	int getPrice()
	{
		return price;
	}
}
class CheaperFood
{
	void getCheaperFood(FoodItem ...f)
	{
		int k = 0;
		for(int i = 0; i < f.length - 1 ; i++)
		{
			int j = i+1;
			if(f[i].getPrice() > f[j].getPrice())
			{
				k = j;
			}
		}
		
		System.out.print("The cheaper price product is: "+f[k].getFoodName()+"\t price is: "+f[k].getPrice());
	}
}
public class FoodItemApp
{
	public static void main(String x[])
	{
		FoodItem f1 = new FoodItem();
		f1.setFoodName("Wadapaw");
		f1.setPrice(15);
		
		FoodItem f2 = new FoodItem();
		f2.setFoodName("samosa");
		f2.setPrice(20);
		
		FoodItem f3 = new FoodItem();
		f3.setFoodName("Pulaw");
		f3.setPrice(50);
		
		CheaperFood cf = new CheaperFood();
		cf.getCheaperFood(f1,f2,f3);
	}
}