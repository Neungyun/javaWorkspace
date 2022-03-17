/**
 * ScoreInput.java
 * 
 * get score and check if it is in 0~100 range
 */
package week3;
import java.util.Scanner;
public class ScoreInput {
	public static void main(String[] args) {
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("input score ");
		score = scan.nextInt();
		if(score >=0 && score <= 100) {
			System.out.printf("%d is in 0~100 range%n",score );
		}
		else {
			System.out.printf("%d is not in 0~100 range%n", score);
		}
		
		
	}
}
