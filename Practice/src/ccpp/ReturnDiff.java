package ccpp;

import java.util.Arrays;

//16.	Given number:231, rearrange and find its max and min and return its difference: 321-123
public class ReturnDiff {
	
	public static int diff(int num) {
		int max=0;
		int min=0;
		char[] ch=Integer.toString(num).toCharArray();
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			min=min*10+ch[i];
			int j=ch.length-i-1;
			max=max*10+ch[j];
		}
		System.out.println(max);
		System.out.println(min);
		return max-min;
		
	}
	
	public static void main(String[] args) {
		int num=231;
		
		System.out.println(diff(num));
		
	
		

	}

}
