package Practice_Project4;

import java.util.Scanner;

public class LIS {

	static int lis(int arr[], int n) {
		int lis[] = new int[n];
		int i, j, max = 0;

		// Initialize LIS value as 1
		for (i = 0; i < n; i++)
			lis[i] = 1;

		for (i = 1; i < n; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		for (i = 0; i < n; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int i;

		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the array elements");

		;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("\ninput array");
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
		
		System.out.println("\nLength of lis is " + lis(arr, n));
	}
}
