package Patterns;

public class Star1 {

	public static void main(String[] args) {
		// pattern1(5);
		pattern5(5);

	}

	// 1
	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) { // col 1 to row
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	// 2
	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) { // col 1 to n
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	// 3
	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) { // col 1 to n-row+1
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	// 4
	static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) { // col 1 to row // print col
				System.out.print(col + " ");
			}
			System.out.println(" ");
		}
	}
	//5
/*
*  
* *  
* * *  
* * * *  
* * * * *  
* * * *  
* * *  
* *  
*
*/
	static void pattern5(int n) { // row=2n-1
		for (int row = 0; row < 2 * n; row++) {
			int totalColInRow = row > n ? 2 * n - row : row;   //row>n?2*n-row:row
			for (int col = 0; col < totalColInRow; col++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
