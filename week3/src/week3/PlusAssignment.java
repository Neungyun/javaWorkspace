/**
 * PlusAssignment.java
 * 
 * 누적대입 연산자의 연산 결과 출력
 */
package week3;

public class PlusAssignment {
	public static void main(String[] args) {
		int a = 0;
		System.out.println("initial a value");
		System.out.printf("\ta = %d%n",a);
		a += 1; // expectation 1
		System.out.println("after a += 1");
		System.out.printf("\ta = %d%n",a);
		a += a + 1; // expectation 3
		System.out.println("after a += a + 1");
		System.out.printf("\ta = %d%n",a);
		a *= a * a; // expectation 3
		System.out.println("after a *= a * a");
		System.out.printf("\ta = %d%n",a);
	}
}
