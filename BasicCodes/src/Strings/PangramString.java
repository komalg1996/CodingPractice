package Strings;

public class PangramString {

	private static void containsAllLeters(String str) {
		str=str.toLowerCase();
		boolean flag=true;
		for(char i='a';i<='z';i++) {
			if(!str.contains(String.valueOf(i))) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("panagram");
		}else {
			System.out.println("Not panagram");
		}
		
	}
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwx";
		containsAllLeters(str);
	}
}
