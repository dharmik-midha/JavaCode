package test;
import java.io.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int k=sc.nextInt();
		
		char[] cs=new char[s.length()];
		char []ct=new char[t.length()];
		int count=0;
		for(int i=0,j=0;i<s.length()&&j<t.length();i++,j++)
		{
			if(cs[i]!=ct[j])
			{
				break;
			}
			count++;
		}
		System.out.println(count);
			
}
}