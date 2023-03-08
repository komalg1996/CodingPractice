import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,6,1,3);
		list.stream().filter(i->i%2==0).map(i->i*i).forEach(i->System.out.println(i));
		list.add(7);

	}

}
