
public class ToUpper1 {

	public static String toUpper(String s1) {
		String res="";
		String []str=s1.split(" ");
		for(String s : str) {
			String first= s.substring(0, 1);
			String other= s.substring(1);
			res+=first.toUpperCase()+other+" ";
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		String s1="i am placed in dassault systems";
		System.out.println(toUpper(s1));

	}

}
