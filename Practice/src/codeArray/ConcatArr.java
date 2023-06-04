package codeArray;
//not this
import java.util.Arrays;
import java.util.Scanner;

public class ConcatArr {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of 1st array : ");
	int size1=sc.nextInt();
	System.out.println("enter size of 2nd array : ");
	int size2=sc.nextInt();
	int[] arr1=new int[size1];
	int[] arr2=new int[size2];
	System.out.println("enter elements in 1st Array :");
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("enter elements in 2nd Array :");
	for(int i=0;i<arr2.length;i++) {
		arr2[i]=sc.nextInt();
	}
	Arrays.sort(arr1);
	System.out.println("1st Array elements"+Arrays.toString(arr1));
	Arrays.sort(arr2);
	System.out.println("2nd Array elements"+Arrays.toString(arr2));
	
	int x=arr1.length+arr2.length;
	int []newArray=new int[x];
	int k=0;
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;i<arr2.length;j++) {
			if(arr1[i]<arr2[j]) {
				newArray[k++]=arr1[i];
			}else {
				newArray[k++]=arr2[j];
			}
		}
	}
	
//	System.out.println("---display array---");
//	for(int i=0;i<arr1.length;i++) {
//		for(int j=0;j<arr2.length;j++) {
//			
//		}
//	}
	}

}
