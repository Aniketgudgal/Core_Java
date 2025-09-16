/*
1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
Explanation: Helps understand class and method creation.
*/
public class MSGPrint
{
	public static void main(String x[])
	{
		MessagePrint m = new MessagePrint();
		m.printMessage();
	}
}
class MessagePrint
{
	void printMessage()
	{
		System.out.printf("Hello World !");
	} 
}