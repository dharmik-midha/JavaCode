import java.io.*;

public class Point {
	int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x1) {
		this.x = x1;
	}

	public int gety() {
		return y;
	}

	public void setY(int y1) {
		this.y = y1;
	}

	Point() {
		x = y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
		System.out.println("Point constructor with x and y: " + x + "," + y);
	}

	Point(int a, int b, int c) {
		this(a, b);
	}// this keyword is used to call another constructor (constructor chaining)

	public static void main(String args[]) {
		Point p = new Point(12, 13, 14);
		Point p1 = new Point();
		System.out.println("Value of p1: " + p1.getX());
		p.setX(12);
		System.out.println("Value of p(x): " + p.getX());
		p.setY(18);
		System.out.println("Value of p(y): " + p.gety());
		System.out.println("sum	 of p(x) and p(y): " + (p.getX() + p.gety()));

	}
}
