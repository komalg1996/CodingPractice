package Strings;

public class TruncateSentence {

	public String truncateSentence(String s, int k) {

		String [] arr = s.split(" ");
		StringBuilder sb= new StringBuilder();
		for (int i = 0; i < k; i++) {
            sb.append(arr[i]).append(" ");
        }
		 sb.setLength(sb.length() - 1);
	        return sb.toString();
        
    }
	public static void main(String[] args) {
		TruncateSentence t = new TruncateSentence();
		String s = "Hello komal how are you Contestant ";
		int k = 5;
		System.out.println(t.truncateSentence(s, k));

	}

}
