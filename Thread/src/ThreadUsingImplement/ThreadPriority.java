package ThreadUsingImplement;
public class ThreadPriority implements Runnable {

	int x;
	int y;
	Thread t;
	static int priority = 5;

	ThreadPriority(int a1, int b1) {
		t = new Thread(this, "ChildpPriority");
		x = a1;
		y = b1;
		t.start();
	}

	public void run() {
		System.out.println("sum is " + (x + y));
		System.out.println("multiplication is " + (x * y));
	}

	public static void main(String arg[]) {
		int a = 10;
		int b = 5;
		ThreadPriority p = new ThreadPriority(a, b);
		ThreadPriority p1 = new ThreadPriority(20, 40);
		Thread t = new Thread(p);
		Thread t1 = new Thread(p1);

		t.setPriority(8);
		t1.setPriority(9);
		System.out.println("difference is " + (a - b));
	}
}
