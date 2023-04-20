package ccpp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayByK {

	public static void rotate(Integer[]arr,int k) {
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(arr));
		//System.out.println(li);
		System.out.println(li.get(4));
		int j=0;
		//System.out.println(li.size());
		for(int i=li.size()-k;i<li.size();i++) {	//i=4...i=5...i=6
			while(j<k) {							//0<3...1<3...2<3
				int temp=li.get(i);					//temp=5..6...7
				li.remove(i);
				li.add(j, temp);
				j++;
				break;
			}
		}
		
		System.out.println(li);
		
	}
	
	public static void main(String[] args) {
					//	0,1,2,3,4,5,6
		Integer[] arr= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int k=3;
		rotate(arr,k);
		
		
	}

}
