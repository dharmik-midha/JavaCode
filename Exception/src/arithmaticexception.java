import java.io.*;
import java.util.Scanner;

public class arithmaticexception {

	public static void main(String arg[]) {
		try {
			int a = 100;
			int b;
			System.out.println("enter the no.to divide ");
			Scanner sc = new Scanner(System.in);
			b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		}

		catch (ArithmeticException e) {
			System.out.println("exception is " + e);
			System.out.println("it shows the programm still continuos");
		}

	}
}
