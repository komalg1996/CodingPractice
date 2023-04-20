import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	 public static void main(String[] args) {
		String[] s= {"komu","pratik","prachi","Shweta"};
		//1:Arrays.asList
		ArrayList<String> a=new ArrayList<String>(Arrays.asList(s));
		//a.add("Kartik");
		System.out.println(a);
		
		int[] arr= {4,6,1,7,9,3};
		//ArrayList<Integer> larr = new ArrayList<Integer>(Arrays.asList(arr));
		
		//2:Collections.addAll();
		List<String> al=new ArrayList<String>();
//		Collections.addAll(al, s);
//		System.out.println(al);

		//for
		for(String str : s )
			al.add(str);
		System.out.println(al);
	}
}
