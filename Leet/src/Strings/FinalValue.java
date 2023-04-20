//	2011 Final Value of Variable After Performing Operations

package Strings;

public class FinalValue {

	public static int finalValueAfterOperations(String[] operations) {
		int x=0;
		for(int i=0;i<operations.length;i++) {
			if(operations[i].charAt(1)=='+') {
				x++;
			}else {
				x--;
			}
		}
		
		return x;
	}
	public static void main(String[] args) {
		String []operations = {"X--","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));
	}

}
