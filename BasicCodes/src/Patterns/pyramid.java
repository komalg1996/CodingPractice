package Patterns;

public class pyramid {

	public static void main(String[] args) {
		int row=3;
		 for(int i=row-1;i>=0;i--){
             for(int j=0;j<i;j++){
               System.out.print(" ");
             }
             for(int k=i;k<=row-1;k++){
                 System.out.print("*" + " ");
             }
             System.out.println(" ");
         }
	}
	//   *  
	//  * *  
	// * * * 
}
