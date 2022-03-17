/**
 * BitShift.java
 * 
 * 비트 이동 연산 결과를 출력하는 프로그램
 */
package week3;

public class BitShift {
	public static void main(String[] args) {
		int a = 8;
		int b = -8;
		System.out.printf("%d << %d = %d%n",a,2,a<<2);
		System.out.printf("%d >> %d = %d%n",b,2,b>>2);
		System.out.printf("%d >>> %d = %d%n",b,2,b>>>2);
	}
}
