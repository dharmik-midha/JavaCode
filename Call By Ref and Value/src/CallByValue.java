import java.io.*;

public class CallByValue {
		   public static void swapFunction(int a1, int b1) 
		   {  // Swapping of a and b
		      int c = a1;
		      a1 = b1;
		      b1 = c;
		   }

		   public static void main(String[] args){
		     int a = 30;
		     int b = 45;
		      System.out.println("Before swapping, a = " + a + " and b = " + b);
		      swapFunction(a, b); // this is calling the swapfunction by value or call by value.
		      System.out.println("after calling swap function \nvalue of a "+a+"\nvalue of b "+b);
		   }
	
}
