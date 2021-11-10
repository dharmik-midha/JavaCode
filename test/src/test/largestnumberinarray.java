package test;
import java.util.*;
public class largestnumberinarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5] ;
		for (int i=0;i<5;i++) {
			a[i]=s.nextInt();
		}
	      Arrays.sort(a);
	      int res = a[3];
	      System.out.println("2nd largest element is ::"+res);
	}
}
