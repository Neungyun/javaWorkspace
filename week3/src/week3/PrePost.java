/**
 * PrePost.java
 * 
 * ���� �������� ��ġ�� ��ġ ���̸� ���� ���� ���α׷�
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
