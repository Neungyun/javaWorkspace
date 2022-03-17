/**
 * WrongDouble.java
 * 
 * order of print value is important
 * you can see something wrong because of order of printout variable
 */
package week3;
import java.util.Scanner;
public class WrongDouble {
	public static void main(String[] args) {
		int n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.println("input one integer");
		n2 = n1 = scan.nextInt();
//		System.out.println("2 times of " + n1 + " is " + n1 + n2);	//wrong
		System.out.println("2 times of " + n1 + " is " + (n1 + n2));	//right insert ()1
		
		
	}

}
