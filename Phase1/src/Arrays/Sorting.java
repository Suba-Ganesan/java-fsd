package Arrays;

public class Sorting {
	// creating a method which receives an array as a parameter
	static void sort(int arr[]) {
		int temp, j, i;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[]) {
		int a[] = { 33, 3, 4, 5 };// declaring and initializing an array
		sort(a);//passing array to method
	}
}
