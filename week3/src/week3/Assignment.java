/**
 * Assignment.java
 * 
 * 대입 변환 수행
 */
package week3;

public class Assignment {
	public static void main(String[] args) {
		byte b = 123; // 축소 변환 
		short s = 456; // 축소 변환
		int i = s; // 확장 변환
		// byte b2 = 456; // 오류: byte 범위로 표현 불가 (8bit)
		// byte = -128 ~ 127
		
		// short s2 = i; // 오류: int 리터럴 상수가 아님 리터럴 상수?
		System.out.printf("b = %d%n", b);
		System.out.printf("s =  %d%n", s);
		System.out.printf("i = %d%n", i);
		
		
	}
}
