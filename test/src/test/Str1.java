package test;
import java.io.*;
import java.util.*;

class Str1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char []c=sc.nextLine().toCharArray();
		int len=c.length;
		for (int i=0;i<len/2;i++)
		{
			char temp=c[i];
			c[i]=c[len-i-1];
			c[len-i-1]=temp;
		}
		System.out.println(c);
	}
}
