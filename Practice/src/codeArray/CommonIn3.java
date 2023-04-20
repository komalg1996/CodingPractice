//Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.     
package codeArray;

public class CommonIn3 {

	public static int findCommon(int[] a1,int[] a2,int[] a3) {
		int ans=0;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					for(int k=0;k<a3.length;k++) {
						if(a1[i]==a3[k]) {
							ans=a1[i];
						}
					}
				}
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 2, 3, 4 };
		int[] a3 = { 3, 4, 5 };
		
		System.out.println(findCommon(a1,a2,a3));
	}

}
