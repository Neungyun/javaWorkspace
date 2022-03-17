/**
 * Double.java
 * 
 * get one integer and print out 2 times of the integer
 *
 */
package week3;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("input one integer");
		num = scan.nextInt();
		System.out.println("2 times of "+ num + " is " + 2*num);
	}

}
