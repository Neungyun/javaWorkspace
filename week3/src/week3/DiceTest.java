/**
 * DiceTest.java
 * 
 * make instance of Dice
 */
package week3;
import java.util.Scanner;
import java.util.Random;

public class DiceTest {
	public static void main(String[] args) {

		int d1_point, d2_point;
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		System.out.print("Do you want to roll the Dice?(Y/N): ");
		Scanner scan = new Scanner(System.in);
		char ans = scan.next().charAt(0);
		if (ans == 'Y') {
			d1.roll();
			d2.roll();
			d1_point = d1.getFace();
			System.out.println("Dice1 point = " + d1_point);
			d2_point = d2.getFace();
			System.out.println("Dice2 point = " + d2_point);
			System.out.println("Sum of 2 Dice = "+ (d1_point + d2_point));
		}
		else {
			System.out.println("Exit Program");
			System.exit(0);
		}
		
	}

}

class Dice{
	
	
	private int plane;
	private int point;
	
	public Dice() {
		System.out.print("How many planes? - ");
		Scanner scan = new Scanner(System.in);
		plane = scan.nextInt(); point = 0;
	}
	public Dice(int n) {
		// System.out.println("Initiate Dice");
		plane = n; point = 0;
	}
	
	public void roll() {
		point =(int) (Math.random() * plane + 1) ; // generate random number
        //System.out.println("point = "+point);
	}
	
	public int getFace() {
		if (point == 0) this.roll();
		return point;
	}
	
}