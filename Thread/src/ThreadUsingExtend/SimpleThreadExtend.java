package ThreadUsingExtend;
class MyThread extends Thread{
	int x;int y;
	MyThread(int a1,int b1){
	super("child Thread");
	x=a1;y=b1;
	start();
	}
	public void run(){
	System.out.println("the difference is x-y is "+ (x-y));
	}
}
class SimpleThreadExtend{
	public static void main(String arg[]){
	int a=10; int b=5; String s;
	MyThread m=new MyThread(a,b);
	System.out.println("the sum of variables is "+(a+b));
}
}
