interface ABC
{
	void show();
}
class TestApp implements ABC
{
	public void show()
	{
		System.out.println("show");
	}
}
public class MainApp
{
	public static void main(String x[])
	{
		TestApp t = new TestApp();
		t.show();
	}
}