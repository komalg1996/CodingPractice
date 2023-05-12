import java.util.Arrays;

public class demoS {

	public static void main(String[] args) {
		String str = "a2b3c4";
		String str2 = "";
		for(int i=0;i<str.length();i+=2) {
			int x=Integer.parseInt("" +str.charAt(i+1));
			
			for(int j=0;j<x;j++) {
				System.out.print(str.charAt(i));
			}
		}

//		int[] num = new int[str.length() / 2];
//		int x = 0;
//		for (int i = 1; i < str.length(); i += 2) {
//			num[x++] = Integer.parseInt("" + str.charAt(i));
//			// System.out.println(Arrays.toString(num)); [2,3,4]
//		}
//		int k = 0;
//		System.out.println("----------");
//		for (int i = 0; i < str.length(); i=i+2) {
//			
//			for (int j = 0; j < num[k]; j++) {
//				System.out.print(str.charAt(i));
//
//			}
//			k++;
			
//		}
	}

}
