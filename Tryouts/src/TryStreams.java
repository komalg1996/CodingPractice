import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TryStreams {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,20,30,5,1,40);
		
//		List<Integer> newList = li.stream().filter(i->i>5).collect(Collectors.toList());
//		newList.forEach(x->System.out.println(x));
		
		li.stream().filter(i->i<20).forEach(x->System.out.println(x));
		
		//li.stream().filter(i->i%2!=0).forEach(x->System.out.println(x));
		
		//li.stream().map(i->i*i).forEach(x->System.out.println(x));
	}

}
