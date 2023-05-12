import java.util.Arrays;
import java.util.List;

public class EvenByStresm {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3,5,7,2,8);
		a.stream().map(i->i*i).forEach(x->System.out.println(x));
		
	}

}
