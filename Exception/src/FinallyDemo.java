import java.io.*;

class FinallyDemo {
	static void ProcA() {
		try {
			System.out.println("Inside ProcA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("Inside ProcA finally");
		}
	}

	static void ProcB() {
		try {
			System.out.println("Inside ProcB");
			return;
		} finally {
			System.out.println("ProcB finally");
		}
	}

	public static void main(String[] args) {
		try {
			ProcA();
		} catch (Exception e) {
			System.out.println("inside main" + e);
		}
		ProcB();
	}
}
