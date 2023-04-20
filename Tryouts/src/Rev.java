

public class Rev {
	
	//StringBuilder
	public static void revStr(String s) {
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
	
	//swapping
	public static void revStr1(String s) {
		char []s1=s.toCharArray();
		for(int i=0;i<s1.length/2;i++) {
			char temp=s1[i];
			s1[i]=s1[s1.length-1-i];
			s1[s1.length-1-i]=temp;
		}
		System.out.println(s1);
		String s2=new String(s1);
		System.out.println(s2);
	}
	
	//reverse loop
	public static void revStr2(String s) {
		String newStr="";
		for(int i=s.length()-1;i>=0;i--) {
			newStr+=s.charAt(i);
		}
		System.out.println(newStr);
	}
	
	public static void main(String[] args) {
		String s = "komal";
		revStr(s);
		revStr1(s);	
		revStr2(s);	

	}

}
