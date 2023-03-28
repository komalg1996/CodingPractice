import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		//1
		Object[] objects =li.toArray();
		for(Object o: objects)
		System.out.print(o+" ");
		//2
		Integer[]arr=new Integer[li.size()];
		arr=li.toArray(arr);
		
		for(Integer a:arr) {
			System.out.print(a);
		}
	}

}
