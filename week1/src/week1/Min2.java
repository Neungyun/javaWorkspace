package week1;
/**
 * Min2.java
 * 
 * �� ������ �о ���� ���� ����ϴ� �� ��° ���α׷�
 */


import java.util.*;



/**
 * ���� ���� �����ϴ� �޼ҵ带 �����ϰ� �̸� �̿��ϴ� Ŭ����
 * @author ����
 *
 */

public class Min2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, m;
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է�");
		x = scan.nextInt();
		y = scan.nextInt();
		m = min(x, y);
		System.out.println(x + "�� "+ y +"�� ���� ��: "+ m );
	}
	
	/**
	 * �Ű������� ���� �� �� �� ���� ���� �����ϴ� �޼ҵ�
	 */
	static int min(int a, int b)
	{
		if(a>b)
			return b;
		else return a;
	}

}
