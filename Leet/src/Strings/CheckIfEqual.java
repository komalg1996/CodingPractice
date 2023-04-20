//1662. Check If Two String Arrays are Equivalent
package Strings;

public class CheckIfEqual {

	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		 StringBuilder w1=new StringBuilder();
		 for(String s : word1) {
			 w1.append(s);
			 //System.out.println(w1);
		 }
		 StringBuilder w2=new StringBuilder();
		 for(String s1 : word2) {
			 w2.append(s1);
			 //System.out.println(w2);
		 }
		 
		 
		return w1.compareTo(w2)==0;
		 
	 }
	public static void main(String[] args) {
		String []word1 = {"ab", "c"};
		String []word2 = {"a", "bc"};

		boolean ans = arrayStringsAreEqual(word1,word2);
		System.out.println(ans);
	}

}
