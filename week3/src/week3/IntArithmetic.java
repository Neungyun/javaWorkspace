/**
 * IntArithmetic.java
 * 
 * operation int type numbers
 */
package week3;

import java.util.Scanner;

public class IntArithmetic {
	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("input two integers");
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.printf("%d + %d = %d%n", a,b,a+b);
		System.out.printf("%d - %d = %d%n", a, b, a-b);
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d%n", a, b, a/b);
		System.out.printf("%d %% %d = %d%n", a, b, a%b);
	}
}
