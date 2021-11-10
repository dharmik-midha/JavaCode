import java.io.*;

class Pointin {
	int x, y;

	// selector and mutator
	int getx() {
		return x;
	} // selector

	int gety() {
		return y;
	} // selector

	void setx(int newValue) {
		x = newValue;
	} // mutator

	void sety(int newValue) {
		y = newValue;
	} // mutator

	Pointin() {
		x = y = 0;
	}

	Pointin(int a, int b) {
		x = a;
		y = b;
	}

	void print() {
		System.out.println("value of x =" + x + "\nvalue of y =" + y); // same function with different implementation
	}
}

//   inheritance 
class Thpointin extends Pointin {
	int z;

	Thpointin() {
		z = 0;
	}

	Thpointin(int a, int b, int c) {
		super(a, b);
		z = c;
	}

	// selector and mutator
	int getz() {
		return z;
	}// selector

	void setz(int newValue) {
		z = newValue;
	}// mutator

	void display() {
		System.out.println("value of z =" + z);
	}

	// main class
	public static void main(String arg[]) {
		Thpointin t = new Thpointin();
		Thpointin t1 = new Thpointin(20, 30, 40);
		t.print();
		t.display();
		t1.print();
		t1.display();
	}
}
