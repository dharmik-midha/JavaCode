package test;
import java.io.*;
import java.util.*;

class Test5 {
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]= a.split(" ");
		int x=0;
		for(String ab: b)
		{
			try {				
			x+=Integer.parseInt(ab);
			}
			catch(Exception e)
			{
				System.out.println("Not a Number Found: "+ab);
			}
		}
		System.out.println(x);
	}
}