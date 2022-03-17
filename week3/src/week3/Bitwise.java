/**
 * Bitwise.java
 * 
 * AND, OR, XOR, NOT 연산 결과 출력
 */
package week3;

public class Bitwise {
	public static void main(String[] args) {
		int a = 0x1f05;
		int b = 0x31a1;
		System.out.printf("%x & %x = %x%n", a,b,a&b);
		System.out.printf("%x | %x = %x%n", a,b,a|b);
		System.out.printf("%x ^ %x = %x%n", a,b,a^b);
		System.out.printf("~ %x = %x", a,~a);
	}
}
