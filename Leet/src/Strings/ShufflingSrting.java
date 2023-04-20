//1528. Shuffle String

package Strings;

public class ShufflingSrting {

public String restoreString(String s, int[] indices) {
	char[]arr=new char[s.length()];
	for(int i=0;i<indices.length;i++) {
		arr[indices[i]]=s.charAt(i);
		//System.out.println(s.charAt(i));
		//System.out.println(indices[i]);
	}
	return String.valueOf(arr);
	
    }
	public static void main(String[] args) {
		ShufflingSrting r = new ShufflingSrting();
		int[] indices={4,5,6,7,0,2,1,3};
		System.out.println(r.restoreString("codeleet", indices ));
		
	}

}
