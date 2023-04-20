//	1108 Defanging an IP Address
package Strings;

public class DefangedIP {

	public static String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
	public static void main(String[] args) {
		String address = "1.1.1.1";
		
		System.out.println(defangIPaddr(address));
	}

}
