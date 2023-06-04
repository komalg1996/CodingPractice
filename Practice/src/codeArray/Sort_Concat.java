package codeArray;

import java.util.Arrays;

public class Sort_Concat {

	public static void main(String[] args) {
		int []arr1= {6,4,2,9,7};
		int []arr2= {5,1,3};
		int l1=arr1.length;
		int l2=arr2.length;
		
		int []res=new int[l1+l2];
		
		sortedMerge(arr1,arr2,l1,l2,res);
	}

	public static void sortedMerge(int arr1[],int arr2[],int l1,int l2,int res[]) {
		Arrays.sort(arr1);
		System.out.println("Array 1: "+Arrays.toString(arr1));
		Arrays.sort(arr2);
		System.out.println("Array 2: "+Arrays.toString(arr2));
		int i=0,j=0,k=0;
		while(i<l1 && j<l2) {
			if(arr1[i]<arr2[j]) {
				res[k]=arr1[i];
				i=i+1;
				k=k+1;
			}else {
				res[k]=arr2[j];
				j=j+1;
				k=k+1;
			}
		}
		//merging remaining elements
		while(i<l1) {
			res[k]=arr1[i];
			i=i+1;
			k=k+1;
		}
		while(j<l2) {
			res[k]=arr2[j];
			j=j+1;
			k=k+1;
		}
		
		System.out.println("Sorted Merged list:"+ Arrays.toString(res));
	}
}
