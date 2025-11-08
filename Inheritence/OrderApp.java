/*
6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.


Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.


Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/
class Order
{
	int orderId;
	int amount;
	int bill()
	{
		return 0;
	}
	int cashback()
	{
		return 0;
	}
	void finalBill()
	{
		System.out.println("Order id: "+orderId + " Order Amount: "+amount+" Devliery charges: "+bill()+" cashback: "+cashback());
		System.out.println("Total Bill is: "+(amount+bill()-cashback()));
	}
}
class CODOrder extends Order
{
	int bill()
	{
		return 50;
	}
}
class OnlinePaymentOrder extends Order
{
	int bill()
	{
		return 0;
	}
	int cashback()
	{
		int dis = 5;
		return ((dis*amount)/100);
	}
}
class OrderApp
{
	public static void main(String x[])
	{
		OnlinePaymentOrder o1 = new OnlinePaymentOrder();
		o1.orderId = 1;
		o1.amount = 500;
		
		CODOrder c1 = new CODOrder();
		c1.orderId = 1;
		c1.amount = 500;
		
		o1.finalBill();
		c1.finalBill();
	}
}
