package Patterns;

public class NumPiramid {

	public static void main(String[] args) {
			int row=5;
			int k=0;
			for(int i=0;i<row;i++) {
				for(int j=0;j<=i;j++) {
					k++;
					System.out.print(k+" ");
				}
				System.out.println();
			}
	}

}
