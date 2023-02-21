//1528. Shuffle String

package Strings;

public class ShufflingSrting {

public String restoreString(String s, int[] indices) {
	char[] sarr = new char[indices.length];
	for(int i=0;i<indices.length;i++) {
		sarr[indices[i]]=s.charAt(i);
	}
	return String.valueOf(sarr);
        
    }
	public static void main(String[] args) {
		ShufflingSrting r = new ShufflingSrting();
		int[] indices={0,1,2};
		System.out.println(r.restoreString("abc", indices ));
		
	}

}
