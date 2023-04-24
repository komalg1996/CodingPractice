//replace character with its occurance
//OPENTEXT-->OPEN1EX2

package strings;

import java.util.Arrays;

public class ReplaceOccurance {

	public static void main(String[] args) {
		String str="opentextttttttttt";
		char ltr='t';
		
		//check if ltr present in string
		if(str.indexOf(ltr)==-1) {
			System.out.println("letter not in string");
			System.exit(0);
		}
		//logic to replace ltr in string with its occurance
		
		int cnt = 1;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==ltr) {
				str=str.replaceFirst(String.valueOf(ltr), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(str);
		
		
		
		
		
		
		
		
		
//		char []arr=str.toCharArray();
//		int count=1;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==ltr) {
//				//arr[i]=(char) count;
//				arr[i]=String.valueOf(ltr).charAt(0);
//				count++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		

	}

}
