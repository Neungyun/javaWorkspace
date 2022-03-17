/**
 * stringTest.java
 * 
 * HW2 - 2018124020 ±Ë¥…¿±
 */
package week3;
import java.util.Scanner;
public class stringTest {
	public static void main(String[] args) {
		System.out.println("INPUT : This is a Test Program"); // 1)
		Scanner scan = new Scanner(System.in);
		String testStr = scan.nextLine();
		//String testStr = "This is a Test Program"; 
		System.out.println(testStr.toLowerCase()); // 2) 
		System.out.println(testStr.replace("Test", "JAVA")); // 3)
		String testStr2 = testStr.replace("Test", "JAVA");
		System.out.println(testStr2.substring(testStr2.indexOf("JAVA")));		
	}
}
