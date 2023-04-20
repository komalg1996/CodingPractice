package array;

import java.util.LinkedList;
import java.util.Queue;

public class Rotate {

	static void rotateArr(int arr[], int d, int n)
    {
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(arr[i]);
        }
        for(int i=0;i<d;i++){
            q.add(q.poll());
        }
        for(int i=0;i<n;i++){
            arr[i]=q.poll();
        }
    }
	public static void main(String[] args) {
	
	}

}
