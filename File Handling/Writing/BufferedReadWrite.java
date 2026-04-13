import java.io.File;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedReadWrite
{
	public static void main(String x[]) throws IOException
	{
		try{
		
		String path = "D://Tech Hub//github core java//File Handling//Writing//abc123.txt";
		File f = new File(path);
		if(!f.exists())
		{
			boolean created = f.createNewFile();
			if(created)
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("Error to create file");
			}
		}
		FileWriter fw = new FileWriter(path, true);
		BufferedWriter bf = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Data: ");
		String input = sc.nextLine();
		bf.write(input);
		bf.newLine();
		bf.close();
		fw.close();
		System.out.println("Data write");
		}
		catch(IOException e)
		{
			System.out.println("Error in Input output: "+e);
		}
	}
}
