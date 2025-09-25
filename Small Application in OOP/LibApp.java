/*
1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
*/
import java.util.Scanner;
class Book
{
	private String bookName;
	private String authorName;
	private int price;
	//getter setter method
	public void setBookName(String bn)
	{
		bookName = bn;
	}
	public String getBookName()
	{
		return bookName;
	}
	public void setAuthorName(String an)
	{
		authorName = an;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public void setPrice(int p)
	{
		price = p;
	}
	public int getPrice()
	{
		return price;
	}
}
class BookInfo
{
	
	Book b1;
	void setBookData(Book b)
	{
		b1 = b;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the name of book: ");
		String name = sc.nextLine();
		System.out.printf("Enter the Author name: ");
		String author = sc.nextLine();
		System.out.printf("Enter the price of book: ");
		int price = sc.nextInt();
		b1.setBookName(name);
		b1.setAuthorName(author);
		b1.setPrice(price);
		System.out.printf("\n");
	}
	
	void showData()
	{
		System.out.println("Book name: "+b1.getBookName()+"\t\t Author Name: "+b1.getAuthorName()+"\t\t price of book: "+b1.getPrice());
	}
}
class ExpensiveBook
{
	public void expensiveBook(Book b1, Book b2)
	{
		if(b1.getPrice() > b2.getPrice())
		{
			System.out.println("the expensive book is: "+b1.getAuthorName()+"\t\t the price is: "+b1.getPrice());
		}
		else
		{
			System.out.println("the expensive book is: "+b2.getAuthorName()+"\t\t the price is: "+b2.getPrice());
		}
	}
}
public class LibApp
{
	public static void main(String x[])
	{
		BookInfo bi = new BookInfo();
		Book b1 = new Book(); // first book
		bi.setBookData(b1);
		Book b2 = new Book(); // second book
		bi.setBookData(b2);
		
		bi.showData();
		bi.showData();
		
		ExpensiveBook ex = new ExpensiveBook();
		ex.expensiveBook(b1,b2);
	}
}