import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyArray {

	public static void main(String[] args) {
		int []arr= {22,11,44,88,55};			//array
		
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
//		List l= Arrays.asList(arr);
		List l1=new ArrayList<>();
//		l1.add(10);
//		System.out.println(l1);
		
		Collections.addAll(l1, arr);
		
		List<Integer> l2=Arrays.asList(4,3,5,2,5,1);		//collections
		
		
		//for
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		//list.sort(null);
		
		//stream
		List<Integer> l4 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(l4);
	}

}
