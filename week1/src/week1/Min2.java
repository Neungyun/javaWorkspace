package week1;
/**
 * Min2.java
 * 
 * 두 정수를 읽어서 작은 수를 출력하는 두 번째 프로그램
 */


import java.util.*;



/**
 * 작은 수를 리턴하는 메소드를 정의하고 이를 이용하는 클래스
 * @author 능윤
 *
 */

public class Min2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, m;
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수 입력");
		x = scan.nextInt();
		y = scan.nextInt();
		m = min(x, y);
		System.out.println(x + "와 "+ y +"의 작은 값: "+ m );
	}
	
	/**
	 * 매개변수로 받은 두 수 중 작은 수를 리턴하는 메소드
	 */
	static int min(int a, int b)
	{
		if(a>b)
			return b;
		else return a;
	}

}
