package test;
import java.util.*;

public class factrecursion {
	static int Factorial(int N) {
		if(N==0) {
		return 1;
		}
		return(N*Factorial(N-1));
	}
	
	
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		System.out.println(Factorial(n));
	}
}
}
