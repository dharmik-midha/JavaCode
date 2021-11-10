package test;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

 class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(i==0){
				b[0]=-1;
			}
			if(i>=1) {
				if(a[i-1]<a[i]) {
					b[i]=a[i-1];
				}
				else {
					b[i]=-1;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
