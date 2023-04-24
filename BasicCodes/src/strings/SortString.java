package strings;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str = "rock";
		
		//Way 1: without using sort method
		char [] arr=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {	//ASCCI values will be compared
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		System.out.println(arr);	//ckor
		
		//Way 2: with sort method
		String str1 = "komal";
		char [] arr1=str1.toCharArray();
		Arrays.sort(arr1);
		System.out.println(new String(arr1));
		//System.out.println(arr1);
	}

}
