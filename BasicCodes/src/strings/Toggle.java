package strings;

public class Toggle {

	public static String toggle(String s) {
		String []s1=s.split(" ");
		String back="";
		for(String w:s1) {
			String first=w.substring(0, 1);
			String rest= w.substring(1);
			back+=first+rest.toUpperCase()+" ";
			
		}
		
		
		return back;
		
	}
	
	public static void main(String[] args) {
		String s = "this is javatpoint";		//tHIS iS jAVATPOINT
		System.out.println(toggle(s));
	}

}
