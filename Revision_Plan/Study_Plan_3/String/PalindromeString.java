public class PalindromeString
{
	public static void main(String x[])
	{
		String s = "A man, a plan, a canal: Panama";
		char[] ch = new char[s.length()];
       int i = 0; 
       int j = 0;
	   char abc = '9';
	   System.out.println((int)abc);
       while(i < ch.length)
       {
        if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
        {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
            {
                ch[j] = (char)(s.charAt(i) + 32);
                j++;
            }
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
            {
                ch[j] = s.charAt(i);
                j++;
            }
        }
        i++;
       }
	   int k = j;
       i = 0;
	   j--;
       boolean flag = true;
       while(i < j)
       {
        if(ch[i] != ch[j])
        {
            flag = false;
            break;
        }
        i++;
        j--;
       }
	   i = 0;
	   while(i <= j && i < ch.length)
	   {
			System.out.print(ch[i]);
			i++;
	   }
	   System.out.println();
       if(flag)
       {
        System.out.println(flag);
       }
       else
       {
        System.out.println(flag);
       }
	}
}