package Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
	int i,j;
	int[][] b = { { 10, 5 }, { 6, 9} };

	for (i = 0; i < 2; i++) {
		for (j = 0; j < 2; j++) {
			System.out.println("arr[" + i + "][" + j + "] = " + b[i][j]);
		}
	}
	System.out.println("\nLength of row 1 in b: " + b[0].length);
}
}