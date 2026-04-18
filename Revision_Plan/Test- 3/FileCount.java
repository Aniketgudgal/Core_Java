/*
Q1. A file named text.txt contains multiple lines of text.
 Read the file line by line and for each line calculate:
1. Total vowels
2. Total consonants
3. Total words
Display result line-wise and store final summary into summary.txt
Ignore spaces, digits, and special symbols.
*/
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class FileCount
{
	public static void main(String x[]) throws IOException
	{
		File f = new File("D://Tech Hub//github core java//Revision_Plan//Test- 3//text.txt");
		if(f.exists())
		{
			System.out.println("File alread eixits");
			FileReader fr = new FileReader(f);
			int ch = fr.read();
			int v = 0;
			int con = 0;
			while(ch != -1)
			{
				char c = (char)ch;
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				{
					v++;
				}
				else if(c >= 'a' && c <= 'z')
				{
					con++;
				}
				ch = fr.read();
			}
			int result[] = new int[2];
			result[0] = v;
			result[1] = con;
			File op = new File("D://Tech Hub//github core java//Revision_Plan//Test- 3//summary.txt");
			if(op.exists())
			{
				FileWriter fw = new FileWriter(op);
				BufferedWriter bf = new BufferedWriter(fw);
				for(int i = 0; i < result.length; i++)
				{
					if(i == 0)
					{
						String first  = "Vowles are: ";
						bf.write(first+result[i]);
					}
					else
					{
						String second  = "consonants are: ";
						bf.write(second+result[i]);
					}
				}
				bf.close();
			}
			else
			{
				boolean res = op.createNewFile();
				if(res)
				{
					System.out.println("Output file created");
					FileWriter fw = new FileWriter(op);
					BufferedWriter bf = new BufferedWriter(fw);
					for(int i = 0; i < result.length; i++)
					{
						if(i == 0)
						{
							String first  = "Vowles are: ";
							bf.write(first+result[i]);
						}
						else
						{
							String second  = "consonants are: ";
							bf.write(second+result[i]);
						}
					}
					bf.close();
					System.out.println("Data write");
				}
				else
				{
					System.out.println("Problem to create file");
				}
			}
		}
		else
		{
			boolean res1 = f.createNewFile();
			if(res1)
			{
				System.out.println("File created");
				FileReader fr = new FileReader(f);
				int ch = fr.read();
				int v = 0;
				int con = 0;
				while(ch != -1)
				{
					char c = (char)ch;
					if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					{
						v++;
					}
					else if(c >= 'a' && c <= 'z')
					{
						con++;
					}
					ch = fr.read();
				}
				int result[] = new int[2];
				result[0] = v;
				result[1] = con;
				File op = new File("D://Tech Hub//github core java//Revision_Plan//Test- 3//summary.txt");
				if(op.exists())
				{
					FileWriter fw = new FileWriter(op);
					BufferedWriter bf = new BufferedWriter(fw);
					for(int i = 0; i < result.length; i++)
					{
						if(i == 0)
						{
							String first  = "Vowles are: ";
							bf.write(first+result[0]);
						}
						else
						{
							String second  = "consonants are: ";
							bf.write(second+result[1]);
						}
					}
					System.out.println("Data write");
				}
				else
				{
					boolean res = op.createNewFile();
					if(res)
					{
						System.out.println("Output file created");
						FileWriter fw = new FileWriter(op);
						BufferedWriter bf = new BufferedWriter(fw);
						for(int i = 0; i < result.length; i++)
						{
							if(i == 0)
							{
								String first  = "Vowles are: ";
								bf.write(first+result[i]);
							}
							else
							{
								String second  = "consonants are: ";
								bf.write(second+result[i]);
							}
						}
					}
					else
					{
						System.out.println("Problem to create file");
					}
				}
			}
			else
			{
				System.out.println("File not created");
			}
		}
	}
}