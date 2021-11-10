import java.io.*;

class ThreePoint {
	int x;
	int y;
	int z;

	ThreePoint() {
		x = 0;
		y = 0;
		z = 0;
		System.out.println("values of x=" + x + " y=" + y + " z=" + z);
	}

	ThreePoint(int x1, int y1, int z1) {
		int x = x1;
		int y = y1;
		int z = z1;

		System.out.println("values of x=" + x + " y=" + y + " z=" + z);
	}

	ThreePoint(int z2) {
		x = 10;
		y = 20;
		z = z2;
		System.out.println("values of x=" + x + " y=" + y + " z=" + z);
	}

	public static void main(String arg[]) {
		ThreePoint t = new ThreePoint();
		ThreePoint t1 = new ThreePoint(25, 35, 45);
		ThreePoint t2 = new ThreePoint(30);
	}
}
