/**
 * FtoC.java
 * 
 * ȭ���µ��� �����µ��� ��ȯ�ϴ� ���α׷�
 */
package week1;

import java.util.*;

public class FtoC {
	public static void main(String args[])
	{
		double celsius;
		double fahrenheit;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ȭ���µ�: ");
		fahrenheit = scan.nextDouble();
		celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
		System.out.println("�����µ� : " + celsius);
	}

}
