package strings;

public class Capital1 {

	public static String uppercase1(String s1) {
		String []words= s1.split("\\s");
		String upStr="";
		for(String w: words) {
		String first=w.substring(0, 1);
		
		String after=w.substring(1);
		upStr+=first.toUpperCase()+after+" ";
		
		}
		
		
		return upStr;
		
	}
	
	public static void main(String[] args) {
		String s1="i love my country";
		System.out.println(uppercase1(s1));
		
		
	}

}
