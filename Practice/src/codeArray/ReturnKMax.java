//return k maximum elements in array in descending order
package codeArray;

import java.util.Arrays;

public class ReturnKMax {

	public static void main(String[] args) {
		int []a1= {10,40,50,20,30,80,90};
		int k=3;
		int []temp=new int[k];
		int x=0;
		Arrays.sort(a1);
		//[10, 20, 30, 40, 50]
		System.out.println(Arrays.toString(a1));
		for(int i=a1.length-1;i>=a1.length-k;i--) {
			temp[x++]=a1[i];
		}
		System.out.println(Arrays.toString(temp));
	}

}
