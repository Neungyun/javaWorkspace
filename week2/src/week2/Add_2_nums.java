/**
 * Add_2_nums.java
 * 
 * program that add 2 input integers
 */
package week2;

import java.util.Scanner;

public class Add_2_nums {
	public static void main(String[] args) {
		int x, y, sum1, sum2;
		System.out.print("X? ");
		Scanner scan1 = new Scanner(System.in);
		x = scan1.nextInt();
		
		System.out.print("Y? ");
		Scanner scan2 = new Scanner(System.in);
		y = scan2.nextInt();
		
		sum1 = Add(x,y);
		
		sum2 = x + y;
		
		System.out.println("Function output : Add(" +  x + "," +  y + ") = " + sum1);
		// calculate through method
		System.out.println("Calculation output: "+  x + " + " +  y + " = " + sum2);
		// direct calculation
		
		MyInfo(); // method which print out my name and ID
	}
	
	static int Add(int a, int b) {
		int sum;
		sum = a + b;
		
		return sum;
	}
	
	static void MyInfo() {
		System.out.println("Name : Neungyun Kim");
		System.out.println("ID : 2018124020");
	}
}
