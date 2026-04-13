/*
Count Vowels in File
Description:
Read file content and count vowels (a, e, i, o, u), ignoring case.
Example:
Hello Java
Vowels → e, o, a, a
*/
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class VowelsFileWriter
{
	public static void main(String x[]) throws IOException
	{
		String path = "D:\\Tech Hub\\github core java\\File Handling\\Writing\\vowels.txt";
		File f = new File(path);
		if(!f.exists())
		{
			boolean result = f.createNewFile();
			if(result)
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("Error To create file");
			}
		}
		if(f.exists())
		{
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bf = new BufferedWriter(fw);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the text: ");
			String input = sc.nextLine();
			bf.write(input);
			bf.close();
			fw.close();
			System.out.println("Data Writed");
		}
		else
		{
			System.out.println("File not exist");
		}
	}
}