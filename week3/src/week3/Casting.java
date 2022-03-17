/**
 * Casting.java
 * 
 * explicit casting
 */
package week3;
/**
 * byte : 8 bit (1 byte)
 * short: 16 bit (2 byte)
 * int : 32 bit (4 byte)
 * long : 64 bit (8 byte)
 * 
 * @author ¥…¿±
 *
 */
public class Casting {
	public static void main(String[] args) {
		short s = 456;
		int i = s;
		byte b2 = (byte) 456;
		short s2 = (short)i;
		int i2 = (int)3.14;
		
		System.out.printf("b2 = %d%n", b2); // -56
		System.out.printf("s2 = %d%n", s2); // 456
		System.out.printf("i2 = %d%n", i2);
	}

}
