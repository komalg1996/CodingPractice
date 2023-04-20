package collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MyHashmap {

	public static void main(String[] args) {
		HashMap<Employee, Integer> map = new HashMap<Employee, Integer>();

		Employee e1 = new Employee(101, "komal");
		map.put(new Employee(107, "komal"), 100);
		map.put(new Employee(104, "komal"), 200);
//
		map.put(new Employee(102, "Pratik"), 2);
		map.put(new Employee(103, "kartik"), 3);

//		map.put(1, "abc");
	//	map.put(1, "abc");

		System.out.println(map);

		//Set<Employee> s=map.keySet();
		// Collection<Integer> l=map.values();

		Iterator<Employee> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			// Employee e2 = (Employee) itr.next();
			System.out.println(itr.next().name);
		}
		Iterator<Integer> itr1 = map.values().iterator();
		while (itr1.hasNext()) {

			System.out.println(itr1.next());
		}

		Iterator itr2 = map.entrySet().iterator();
		while (itr2.hasNext()) {
			Map.Entry<Employee,Integer> m=(Entry) itr2.next();
			System.out.println(m.getKey().name+"..."+m.getValue());
		}
		
		
		//new
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(5,"pratik");
		hm.put(6,"john");
		hm.put(4,"krishna");
		hm.put(8,"ram");
		hm.put(1,"sita");
		

		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyComparator3());
		tm.putAll(hm); 	
		System.out.println(tm);
		
		
		

		
		
		
		
		
		
	}
	
	
	
	
	

}

class MyComparator3 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
		return 1;
		else if(o1>o2)
			return -1;
		else
			return 0;
	}
	
}
