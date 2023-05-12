
public class Demo2 {

	public static void main(String[] args) {
		String s1="a3b2c3";
		String s2="";
		
		for(int i=0;i<s1.length();i=i+2) {
			int x=Integer.parseInt(""+s1.charAt(i+1));
			for(int j=0;j<x;j++) {
				System.out.print(s1.charAt(i));
				
			}
		}
		

	}

}
