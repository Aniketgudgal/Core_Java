/*7. First Negative Number in Every Window of Size K

Approach: Sliding Window with queue
Example: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
*/
import java.util.Scanner;
public class NegativeEveryWindow
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take array size from user
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		
		// insert values in array
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();
		int count = 0;
		
		 for (int i = 0; i <= nums.length - k; i++) {
            boolean flag = false;

            // Check elements inside the window
            for (int j = i; j < i + k; j++) {
                if (nums[j] < 0) {
                    System.out.print(nums[j] + " ");
                    flag = true;
                    break;  // Found first negative, move to next window
                }
            }

            // If no negative found in the current window
            if (!flag) {
                System.out.print("0 ");
            }
        }
	}
}
