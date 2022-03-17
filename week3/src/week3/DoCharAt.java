/**
 * DoCharAt.java
 * 
 *  print out characters in String
 */

package week3;

public class DoCharAt {
	public static void main(String[] args) {
		String a = "Playing with Java";
		
		for(int i = 0 ; i < a.length() ; i++) {
			System.out.println(i + "th " + "character is " + a.charAt(i));
		}
		System.out.println();
	}
}
