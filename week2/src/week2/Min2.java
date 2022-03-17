/**
 * Min2.java
 * 
 * print out smaller integer
 */
package week2;

import java.util.*;

public class Min2 {
	public static void main(String[] args) {
		int x, y, m;
		Scanner scan = new Scanner(System.in);
		System.out.println("input two integers");
		x = scan.nextInt();
		y = scan.nextInt();
		
		m = min(x,y);
		System.out.println("smaller value = "+ m);
	}
	
	static int min(int a, int b) {
		if (a > b) return b;
		else return a;
	}
}
