package Arrays;

public class RemoveDuplicate {
	 static int remove_duplicate(int A[],int N){
	       if(N==0 || N==1){
	           return N;
	       }
	    int j=0;
	    for(int i=0;i<N-1;i++)
	        if(A[i]!=A[i+1])
	        A[j++]=A[i];
	        
	        A[j++]=A[N-1];
	         return j;
	    }
	public static void main(String[] args) {
	
	}

}
