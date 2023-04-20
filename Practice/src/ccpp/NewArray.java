package ccpp;

import java.util.Arrays;
import java.util.Collections;

public class NewArray {

	public static void main(String[] args) {
		int[] arr= {33,55,11,22,88};
		//{11,22,33,55,88}
		
		int k= 3;
		int[] temp=new int[k];
		Arrays.sort(arr);
		int c=arr.length-1;
		int [] rev =new int[k];
		for(int i=0;i<rev.length;i++) {
			rev[i] = arr[c];
			c--;
		}
		
		
		int z=0;
		for(int i=arr.length-1;i>=arr.length-k;i--) {
			temp[z]=arr[i];
			z++;
		}
		for(int i=0;i<rev.length;i++) {
		System.out.println(rev[i]);
		}
	}

}
