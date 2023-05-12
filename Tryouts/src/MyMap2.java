import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//lambda
public class MyMap2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "abc");
		map.put(12, "xyz");
		map.put(13, "pqr");
		map.put(14, "klm");
		map.put(15, "ghi");

		Iterator itr=map.keySet().iterator();
		while(itr.hasNext()) {
			int key= (int) itr.next();
			System.out.println(key+" "+ map.get(key));
			
		}
		System.out.println();
		
		//lambda expression in forEach() method to print map elements 
		map.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
