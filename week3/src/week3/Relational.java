/**
 * Relational.java
 * 
 * ���� ������
 */
package week3;

public class Relational {
	public static void main(String[] args) {
		int a = 1;
		int b = -2;
		System.out.printf("(%d == %d) : %b%n", a,b,(a==b));
		System.out.printf("(%d != %d) : %b%n", a,b,(a!=b));
		System.out.printf("(%d > %d) : %b%n", a,b,(a>b));
		System.out.printf("(%d < %d) : %b%n", a,b,(a<b));
		System.out.printf("(%d >= %d) : %b%n", a,b,(a>=b));
		System.out.printf("(%d <= %d) : %b%n", a,b,(a<=b));
	}
	
// %b - boolean value �� ����ϱ� ����
}
