
public class SentenceRev {

	public static void main(String[] args) {
		String s = "This is String";
		String rev="";
		String []sa=s.split(" ");
		for(int i=sa.length-1;i>=0;i--) {
			System.out.print(sa[i]+" ");
		}

	}

}
