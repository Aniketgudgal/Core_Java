/*
7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.


BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
*/
class Ticket
{
	int price;
	int totalTickets;
	void calculatePrice()
	{
	}
}
class MovieTicket extends Ticket
{
	MovieTicket(int ticket)
	{
		this.totalTickets = ticket;
		price =  120;
	}
	void calculatePrice()
	{
		float gst = (18*price)/100;
		System.out.println("The GST Amount is: "+(gst*totalTickets));
		System.out.println("The Total Amount of Movie Ticket is: "+(((int)gst+price))*totalTickets);
	}
}
class BusTicket extends Ticket
{
	BusTicket(int ticket)
	{
		this.totalTickets = ticket;
		price = 50;
	}
	void calculatePrice()
	{
		float gst = (5*price)/100;
		System.out.println("The GST Amount is: "+(gst*totalTickets));
		System.out.println("The Total Amount of Bus Ticket is: "+(((int)gst+price)*totalTickets));
	}
}
public class TicketAPP
{
	public static void main(String x[])
	{
		MovieTicket m = new MovieTicket(1);
		m.calculatePrice();
		
		BusTicket b = new BusTicket(1);
		b.calculatePrice();
	}
}
