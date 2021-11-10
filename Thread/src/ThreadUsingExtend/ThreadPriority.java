package ThreadUsingExtend;
import java.io.*;
class ThreadPriority extends Thread{
	 int x;int y;int z;
	 Thread t; int Priority;
	 ThreadPriority(int a,int b,String s)
	 {	super("thread");
	 	x=a;
	 	y=b;
	 	start();
	 }
	  public void run()
	    {			
		System.out.println("the sum is = "+(x+y));
		System.out.println("the multiplication is = "+(x*y));
		}
	public static void main(String arg[]) {
		 int a=10;
		 int b=20;
		
		 ThreadPriority p1=new ThreadPriority(5,10,"child1");
		 ThreadPriority p2=new ThreadPriority(10,15,"child2");
			p1.setPriority(8);
			p2.setPriority(9);
			System.out.println("the difference is = "+(b-a));
		 }
	}

