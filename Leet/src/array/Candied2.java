package array;

import java.util.ArrayList;

public class Candied2 {

	public static void main(String[] args) {
		int []candies = {2,3,5,1,3};
		int n=candies.length;
		int extraCandies = 3;
		System.out.println(kidsWithCandies(candies,extraCandies));
		
	}

	private static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 ArrayList<Boolean> result = new ArrayList<Boolean>();
		 
	        int max = Integer.MIN_VALUE;
	        
	        for(int i = 0; i < candies.length; i++)
	        {
	            if(candies[i] > max)
	                max = candies[i];
	        }
	        System.out.println(max);
	        for(int i = 0; i < candies.length; i++)
	        {
	            if (candies[i] + extraCandies >= max)
	            {
	                result.add(true);
	            }
	            else
	            {
	                result.add(false);
	            }
	        }
	        return result;
		
	}

}
