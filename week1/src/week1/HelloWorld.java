/**
 * HelloWorld.java
 * 
 * ������ ���ø��� �����ֱ� ���� ���α׷�
 */
package week1;

import java.awt.*;
import java.applet.*;

/**
 * ����, �ѱ�, ���ڸ� �����ִ� ���ø�
 * @author ����
 *
 */

public class HelloWorld extends Applet{
	public void paint (Graphics g) {
		g.drawString("Hello World!", 50,50);
		g.drawString("���ѹα�", 50, 100);
		g.drawString("KOREA", 50, 150);
	}

}
