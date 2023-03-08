import java.util.HashMap;
import java.util.HashSet;

public class MyHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
//		System.out.println(h.put(1, "komal"));
//		System.out.println(h.put(1, "Pratik"));
//		System.out.println(h.get(1));;
		
		HashSet<Integer> s = new HashSet<Integer>();
//		System.out.println(s.add(5));
//		System.out.println(s.add(5));
		
		//if 2 obj are equl they have same hashcode
		String s1="Komu";
		String s2="Komu";
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
