import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
public class FileReadWrite
{
	public static void main(String x[]) throws IOException
	{
		String path = "D://Tech Hub//github core java//File Handling//Writing//abc.txt";
		File f = new File(path);
		f.createNewFile();
		FileWriter fw = new FileWriter(path, true);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String s = sc.nextLine();
		fw.write(s);
		fw.close();
		System.out.println("Writed data");
	}
}