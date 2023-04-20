package strings;
//no
public class Dupli {

	public static void main(String[] args) {
		String str="koko got placed";
		int count =0;
		for(int i =0;i<str.length();i++) {
			count = 0;
			for(int j =i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) &&  str.charAt(i)!=' ') {
					count++;
					//str.charAt(j)='0';
				}
			}
			if(count>0) {
				System.out.println(str.charAt(i));
			}
		}

	}

}
