
public class StringDemo {
	
	    public static void main(String[] args)
	    {
	        String s1 = "GreatLearning";
	        String s2 = "GreatLearning";
	        String s3 = new String("GreatLearning");
	        System.out.println(s1 == s2); // true
	        System.out.println(s1 == s3); // false
	        System.out.println(s1.equals(s2)); // true
	        System.out.println(s1.equals(s3)); // true
	    }
	
}
