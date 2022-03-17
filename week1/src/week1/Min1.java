/**
 * Min1.java
 * 
 * 두 정수를 읽어서 작은 수를 출력하는 첫 번째 프로그램
 *
 */

package week1;

import java.util.*;

/**
 * 두 정수를 읽어서 작은 수를 출력한다.
 * @author 능윤
 *
 */
public class Min1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수 입력");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x<y)
			System.out.println("작은 값: " + x);
		else
			System.out.println("작은 값: " + y);

	}

}
