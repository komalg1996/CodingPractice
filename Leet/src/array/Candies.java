//1431. Kids With the Greatest Number of Candies

package array;

import java.util.ArrayList;
import java.util.List;

public class Candies {

	public static void main(String[] args) {
		int []candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies,extraCandies));

	}
public static List<Boolean> kidsWithCandies(int[] candies, int ec) {
	
	List<Boolean> l = new ArrayList<Boolean>();
	int count=0;
	
	for(int i=0;i<candies.length;i++) {
		int sum=candies[i]+ec;
		count=0;
		for(int j=0;j<candies.length;j++) {
			if(sum>candies[j]) {
				count=1;
				
			}
		}
	}
	for(int i=0;i<candies.length;i++) {
		if(count==1) {
			l.add(true);
		}else {
			l.add(false);
		}
	}
	
	return l;
	    
    
}
}
