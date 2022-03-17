/**
 * HelloWorld.java
 * 
 * 간단한 애플릿을 보여주기 위한 프로그램
 */
package week1;

import java.awt.*;
import java.applet.*;

/**
 * 영문, 한글, 한자를 보여주는 애플릿
 * @author 능윤
 *
 */

public class HelloWorld extends Applet{
	public void paint (Graphics g) {
		g.drawString("Hello World!", 50,50);
		g.drawString("대한민국", 50, 100);
		g.drawString("KOREA", 50, 150);
	}

}
