/**
 * CaseSensitive.java
 * 
 * Show how to use String's method
 */

/**
 * Convert strings into Lower case, Upper case and compare two strings
 */
package week3;

public class CaseSensitive {
	public static void main(String[] args) {
		
		String a = "Playing with Java";
		String b = "playing with java";
		
		System.out.println("Original string: " + a);
		System.out.println("Uppercase string: " + a.toUpperCase());
		System.out.println("Lowercase string: "+ a.toLowerCase() + "\n");
		
		System.out.println("Original string: " + a);
		System.out.println("Compare string: " + a);
		
		if(a.equals(b)) {
			System.out.println("equal() : return True ");
		}
		else {
			System.out.println("equal : return False");
		} // compare two Strings in equals method
		
		
		if(a.equalsIgnoreCase(b)) {
				System.out.println("eqaulsIgnoreCase() : return True");
				}
		else {
				System.out.println("equalsIgnoreCase() : return False");
		} // compare two strings in equalsIgnoreCase method
	}

}
