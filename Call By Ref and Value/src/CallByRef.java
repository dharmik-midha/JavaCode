import java.io.*;

public class CallByRef {

	int x;
	int y;

	public CallByRef(int a, int b) {
		x = a;
		y = b;
	}

	public static void Swap(CallByRef o) {
		int temp;
		temp = o.x;
		o.x = o.y;
		o.y = temp;
	}

	void display() {
		System.out.println("value of x " + x + " value of y " + y);
	}

	public static void main(String ar[]) {
		CallByRef v = new CallByRef(5, 10);
		v.display();
		Swap(v);
		v.display();

	}

}
