package numbers;

public class Gcd {

	static int gcd(int a, int b) {
		int result = Math.min(a, b); // Find Minimum of a and b
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}
		return result; // return gcd of a and b
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int a = 36, b = 60;
		System.out.print("GCD of " + a + " and " + b + " is " + gcd(a, b));
	}

}
