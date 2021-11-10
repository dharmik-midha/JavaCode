package test;
import java.util.Scanner;

class sumofalldigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,d;
		while(n>0)
		{
			d=n%10;
			sum+=d;
			n/=10;
		}
		System.out.println("Sum of all Digits is: "+sum);
	}
}
