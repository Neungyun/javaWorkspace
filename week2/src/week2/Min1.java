/**
 * Min1.java
 * 
 * Print out 2 integers
 */
package week2;

import java.util.Scanner;

public class Min1{
	public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.println("input two integers: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x > y) {
			System.out.println("small : "+ y);
		}
		else
			System.out.println("small : " + x);		
		
	}
}
