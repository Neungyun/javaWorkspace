/**
 * Min1.java
 * 
 * �� ������ �о ���� ���� ����ϴ� ù ��° ���α׷�
 *
 */

package week1;

import java.util.*;

/**
 * �� ������ �о ���� ���� ����Ѵ�.
 * @author ����
 *
 */
public class Min1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է�");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if(x<y)
			System.out.println("���� ��: " + x);
		else
			System.out.println("���� ��: " + y);

	}

}
