package array;

public class Stock {
	public static int maxProfit(int[] prices) {
	      int lst=Integer.MAX_VALUE;
	      int op=0;
	      int profit=0;

	      for(int i=0;i<prices.length;i++) {
	        if(lst>prices[i]){
	          lst=prices[i];
	        }
	        profit=prices[i]-lst;
	        if(profit>op){
	          op=profit;
	        }
	      }       
	      return op; 
	}
	public static void main(String[] args) {
		int[] prices = {3,6,1,2};
		int profit = maxProfit(prices);
		System.out.println(profit);

	}

}
/*	        int lsf = Integer.MAX_VALUE; // least so far
	        int op = 0; // overall profit
	        int profit = 0; // profit if sold today
	        
	        for(int i = 0; i < prices.length; i++){
	            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
	                lsf = prices[i]; // update our least so far
	            }
	            profit = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
	            if(op < profit){ // if pist is more then our previous overall profit
	                op = profit; // update overall profit
	            }
	        }
	        return op; // return op*/