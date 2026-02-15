/*
Top K Frequent Elements
Return the k most frequent elements.
Example
Input: [1,1,1,2,2,3], k=2 → [1,2]
*/
import java.util.Scanner;
import java.util.Arrays;
public class TopKFreqElements
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the values of K: ");
		int k = sc.nextInt();
		
		Arrays.sort(arr);

        int[] values = new int[size];
        int[] freq = new int[size];

        int index = 0;
        int count = 1;

        for (int i = 1; i < size; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } 
            else {
                values[index] = arr[i - 1];
                freq[index] = count;
                index++;
                count = 1;
            }
        }

        values[index] = arr[size - 1];
        freq[index] = count;
        index++;

        // sort by frequency descending
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {

                if (freq[i] < freq[j]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    int temp2 = values[i];
                    values[i] = values[j];
                    values[j] = temp2;
                }
            }
        }

        System.out.print("Top K frequent elements: ");
        for (int i = 0; i < k && i < index; i++) {
            System.out.print(values[i] + " ");
        }
	}
}