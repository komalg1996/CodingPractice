//Write a Java program to add two matrices of the same size.     
package codeArray;

public class Add2Matrix {

	static int N=2;
	
	private static void addMatrix(int[][] a1, int[][] a2, int[][] a3) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		int a1[][]= {{1,1},{2,2}};
		int a2[][]= {{1,1},{2,2}};
		int a3[][]= new int[N][N];
		addMatrix(a1,a2,a3);

		  System.out.print("Result matrix is \n");
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++)
	                System.out.print(a3[i][j] + " ");
	            System.out.print("\n");
	        }
	}


	

}
