/*
9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.

formula: °F = °C × (9/5) + 32
*/
import java.util.Scanner;
public class TemperatureApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		// take input from user
		System.out.printf("Enter the temperature in Celsius: ");
		int cel = xyz.nextInt();
		// create object of the TemperatureConverter class☺
		TemperatureConverter t1 = new TemperatureConverter();
		// call to the method
		float result = t1.convertToFahrenheit(cel);
		// print result
		System.out.printf("The convert of Celsius to Fahrenheit is: %f",result);
	}
}
class TemperatureConverter
{
	// logic of conversion
	float convertToFahrenheit(int num)
	{
		// use formula
		float result = num*(9/5.0f) + 32;
		return result;
	}
}