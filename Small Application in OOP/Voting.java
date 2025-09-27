/*
3. Person Age Verification
Task:
 Create a Person class with fields: name and age.
 In the main method:
Create a Person object.
Check if the person is eligible to vote (age >= 18) and print the result.
Explanation:
 This demonstrates condition checking using instance variables.
*/
import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	int getAge()
	{
		return age;
	}
}

class InputPersonInfo
{
	Scanner sc = new Scanner(System.in);
	Person[] p;
	void setPersonInfo(Person[] p)
	{
		this.p = p;
	}
	void setData()
	{
		int j = 1;
		for(int i = 0; i < p.length; i++)
		{
			p[i] = new Person();
			System.out.printf("\nEnter the %d number voter information\n",j);
			System.out.print("Enter the name of voter: ");
			String name = sc.next();
			p[i].setName(name) ;
			System.out.print("Enter the age of voter: ");
			int age = sc.nextInt();
			p[i].setAge(age);
			j++;
		}
	}
	void showEligibleVoter()
	{
		System.out.println("\n\nEligible Person for Voting");
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].getAge() >= 18)
			{
				System.out.println(p[i].getName()+"\t"+p[i].getAge());
				System.out.printf("\n");
			}
			
		}
	}
}
public class Voting
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of person array: ");
		int size = sc.nextInt();
		Person p[] = new Person[size];
		
		InputPersonInfo obj = new InputPersonInfo();
		obj.setPersonInfo(p);
		obj.setData();
		obj.showEligibleVoter();
	}
}