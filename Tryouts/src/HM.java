import java.util.HashMap;
import java.util.Map;

public class HM {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "Akash");
		map.put(1, "Suraj");
		map.put(null, "komal");
		
		System.out.println(map);
//		for(Map.Entry<Integer, String> m: map.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		
	System.out.println(map.get(2));
		
	}

	public Map<Integer,String> mapThings(Integer key,String value){
		Map<Integer,String> things = new HashMap<Integer, String>();
		things.put(1, "Akash");
		things.put(3, "Kartik");
		things.put(2, "Prachi");
		return things;
		
	}
}
