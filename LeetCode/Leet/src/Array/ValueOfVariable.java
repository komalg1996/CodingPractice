//2011. Final Value of Variable After Performing Operations
package Array;

public class ValueOfVariable {
	   public int finalValueAfterOperations(String[] operations) {
		   int res = 0;
		   
		   for(int i = 0; i< operations.length;i++)
			   if(operations[i].charAt(1)=='+')
			   	   res++;
			   else
				   res--;
		return res;
	        
	    }


	public static void main(String[] args) {
		ValueOfVariable v =new ValueOfVariable();
		//String[] operations = {"--X","X++","X++"};	//1
		String[] operations = {"++X","++X","X++"};		//3
		int value= v.finalValueAfterOperations(operations);
		System.out.println(value);
		
	}

}

