package Patterns;

public class Pyramid2 {
	
	    public static void main(String[] args) {
	        int rows = 5; // Number of rows for each pyramid

	        // Generate inverted pyramid
	        System.out.println("Inverted Pyramid:");
	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= 2 * i - 2; k++) {
	                System.out.print("*");
	            }
	         
	            System.out.println();
	        }
	        
	        
	        for (int i = 1; i < rows-1; i++) {
	            System.out.print(" ");
	        }
	        System.out.println("#");
	        // Generate upright pyramid
	        //System.out.println("Upright Pyramid:");
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 2; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}

