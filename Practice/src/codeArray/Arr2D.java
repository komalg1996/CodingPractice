package codeArray;

import java.util.Scanner;

public class Arr2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int row = sc.nextInt();
		System.out.println("Enter columns : ");
		int column = sc.nextInt();
		int arr[][] = new int[row][column];
		System.out.println("Enter 2D Array values : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// display 2D Array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
