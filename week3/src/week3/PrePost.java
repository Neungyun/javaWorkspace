/**
 * PrePost.java
 * 
 * 증가 연산자의 전치와 후치 차이를 보기 위한 프로그램
 */
package week3;

public class PrePost {
	public static void main(String[] args) {
		int a,b;
		a = b = 5;
		System.out.println("initial a,b");
		System.out.printf("\ta = %d, b = %d%n",	a,b);
		b = 2 * a++;
		System.out.println("after b = 2 * a++");
		System.out.printf("\ta = %d, b = %d%n",	a,b);
		a = b = 5;
		System.out.println("original a,b");
		System.out.printf("\ta = %d, b = %d%n",	a,b);
		b = 2 * ++a;
		System.out.println("after b = 2 * ++a");
		System.out.printf("\ta = %d, b = %d%n",	a,b);

	}
}
