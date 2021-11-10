package ThreadUsingExtend;

class MyThread1 extends Thread {

	int x;
	int y;
	String s;

	MyThread1(int a1, int b1, String s) {
		super(s);
		x = a1;
		y = b1;
		start();
	}

	public void run() {

		if (getName().equals("child1")) {
			System.out.println("the sum is = " + (x + y));
		} else {
			System.out.println("the difference is = " + (x - y));
		}
	}
}

class MultiThreadAriExtend {
	public static void main(String arg[]) {

		int a = 10;
		int b = 5;
		new MyThread1(a, b, "child1");
		new MyThread1(a, b, "child2");
		System.out.println("the multiplication is = " + (a * b));
	}
}
