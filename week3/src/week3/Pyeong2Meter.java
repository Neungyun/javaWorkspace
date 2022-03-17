/**
 * Pyeong2Meter.java
 * 
 * pyeong --> squre meter
 */
package week3;

import java.util.Scanner;


public class Pyeong2Meter {
	public static void main(String[] args) {
		final double ja = 30.0 / 99.0 ;
		final int SIX = 6;
		Scanner scan = new Scanner(System.in);
		System.out.println("input Pyeong");
		double pyeong = scan.nextDouble();
		double sqMeter = (SIX * ja) * (SIX * ja) * pyeong;
		System.out.printf("%.2f pyeong = %.2f m^2 %n", pyeong, sqMeter);
		System.exit(0);
	}
}
