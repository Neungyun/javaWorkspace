/**
 * Define class Point
 */

package week3;

public class Point {
	private double x, y;
	
	public Point() {
		x = 0.0;
		y = 0.0;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}
}
