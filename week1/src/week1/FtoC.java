/**
 * FtoC.java
 * 
 * È­¾¾¿Âµµ¸¦ ¼·¾¾¿Âµµ·Î º¯È¯ÇÏ´Â ÇÁ·Î±×·¥
 */
package week1;

import java.util.*;

public class FtoC {
	public static void main(String args[])
	{
		double celsius;
		double fahrenheit;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("È­¾¾¿Âµµ: ");
		fahrenheit = scan.nextDouble();
		celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
		System.out.println("¼·¾¾¿Âµµ : " + celsius);
	}

}
