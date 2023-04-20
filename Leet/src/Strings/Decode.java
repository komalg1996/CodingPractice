//2325. Decode the Message
package Strings;

import java.util.HashMap;

public class Decode {

	
    public static String decodeMessage(String key, String message) {
		StringBuilder ans = new StringBuilder();//StringBuilder to append string
		key = key.replace(" ", ""); //remove spaces in key
		//System.out.println(key.length());
    	//take hashmap to map key with a-z
		HashMap<Character, Character> letters= new HashMap<Character, Character>();
		char original = 'a';
		for(int i=0;i<key.length();i++) {
			if(!letters.containsKey(key.charAt(i))) {
				letters.put(key.charAt(i),original++ );
			}
		}
    	//System.out.println(letters);
    	
		for(int i=0;i<message.length();i++) {
			if(letters.containsKey(message.charAt(i))) {
				//Now replacing the letters of the message with appropriate letter according to the key
				ans.append(letters.get(message.charAt(i)));	
			}else {
				ans.append(message.charAt(i));
				//This is for characters other than the letters in the key example a space " "

			}
		}
		
    	return ans.toString();
        
    }
    
	public static void main(String[] args) {
		String key="the quick brown fox jumps over the lazy dog";
		String message="vkbs bs t suepuv";
		String reply=decodeMessage(key,message);
		System.out.println(reply);
	}

}
