
import java.io.*;
import java.util.*;

public class MultiCatchException {

	public static void main(String arg[]) {
		try {
			int a = 5;
			int b;
			Scanner s = new Scanner(System.in);
			System.out.println("enter the no");
			b = s.nextInt();
			int c = a / b; // airthmaticexcep.

			int x[] = { 1, 2, 3 };
			System.out.println(x[5]); // arayindexexcep.
		} catch (ArithmeticException e) {
			System.out.println("caught" + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught" + e);
		} catch (Exception e) {
			System.out.println("caught" + e);
		}
		System.out.println("i escaped exception");
	}
}
