package strings;

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
		if(flag==true) {
			System.out.println("panagram");
		}else {
			System.out.println("Not panagram");
		}
		
	}
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		containsAllLeters(str);
	}
}
