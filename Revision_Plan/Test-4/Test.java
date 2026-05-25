public class TestApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		// sort the array
		for(int i = 0; i < arr.length - 1; i++)
		{	
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//
		System.out.print("Enter the target Max: ");
		int target = sc.nextInt();
		int count = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(isDuplicate(arr[i]))
			{
				if(count == target)
				{
					max = arr[i];
				}
				count++;
			}
		}
	}
	public static int secondMax(int arr[], int max)
	{
		int secondMax = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > secondMax && arr[i] < max)
			{
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	public static boolean isDuplicate(int[] arr, int n)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(count > 1)
			{
				return true;
			}
			if(arr[i] == n)
			{
				count++;
			}
		}
		return false;
	}	
}