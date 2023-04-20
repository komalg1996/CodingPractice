import java.util.HashMap;
import java.util.Map;

public class Maptry {

	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m.put('c', 1);
		m.put('d', 1);
		m.put('c', 2);
		m.put('g', 3);
		System.out.println(m);
		System.out.println(m.get('g'));
	}

}
