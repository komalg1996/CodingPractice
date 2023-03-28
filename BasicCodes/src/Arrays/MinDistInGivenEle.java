package Arrays;

public class MinDistInGivenEle {
	 static int minDist(int a[], int n, int x, int y) {
	        int p = -1, q = -1;
	        int len = Integer.MAX_VALUE;
	        for(int i = 0; i<n; i++){
	            if(a[i] == x){
	                
	                if(q != -1) len = Math.min(len, Math.abs(i-q));
	                p = i;
	            }
	            else if(a[i] == y){
	                if(p != -1) len =Math.min(len, Math.abs(i-p));
	                q = i;
	            }
	        }
	        if(len == Integer.MAX_VALUE) return -1;
	        
	        return len;
	    }
	public static void main(String[] args) {
		int []a= {4,8,1,9};
		int n=4;
		int x=4, y=9;
		int len=minDist(a,n,x,y);
		System.out.println(len);
	}

}
