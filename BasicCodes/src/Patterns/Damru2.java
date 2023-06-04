package Patterns;
//correct
public class Damru2 {

	public static void main(String[] args) {
		int row = 5;
		//up
		for(int i=0;i<=row-2;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k = i;k<=row-1;k++) {
				System.out.print("#"+" ");
			}
			System.out.println(" ");
		}
		
		//*
		for(int i = 1;i<row;i++) {
			System.out.print(" ");
			
		}
		System.out.println("*");

		//down
		for(int i=row-2;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=row-1;k++) {
				System.out.print("#"+" ");
			}
			System.out.println(" ");
		}
	}

}
