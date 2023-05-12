
public class CountPatternInsideAString {
	public static void main(String[] args) {
		String s = "jhdsjhdaddkjsaddbasdsadbahdf";
		String pattern = "sad";
		int count=0;
		String []sarray=new String[s.length()-2];
		int end=3;
		for(int start=0;end<=s.length();end++) {
			String s1=s.substring(start,end);
			sarray[start]=s1;
			start++;
			
		}
		for(int i=0;i<sarray.length;i++) {
			if(sarray[i].equals(pattern)) {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
/*String s = "jhdsaddkjsaddbasdsadbahdf";

		String pattern = "sad";
		int count = 0;
		System.out.println(s.length());
		String sarray[] = new String[s.length() - 2];

		int end = 3;
		for (int start = 0; end <= s.length(); end++) {
			String s1 = s.substring(start, end);
			sarray[start] = s1;

			start++;

		}

		for (int i = 0; i < sarray.length; i++) {
			if (sarray[i].equals(pattern)) {
				count = count + 1;
			}
		}

		System.out.println(count);
*/