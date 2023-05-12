import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A2C3B2 {

	public static void main(String[] args) {
		String s = "aaaccccbb"; 

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
		Set<Entry<Character, Integer>> m = map.entrySet();
		for(Entry<Character, Integer> e : m) {
			System.out.print(e.getKey()+" "+e.getValue()+" ");
			
		}
	}

}
abstract class a{
	abstract void m1();
}
abstract class b extends a{
	
}









