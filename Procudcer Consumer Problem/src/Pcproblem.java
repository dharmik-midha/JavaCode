import java.io.*;

class Quantity
 {
	int n;
	boolean valueset=false;
	synchronized int get()
	{
	if(!valueset){	// if true
	try { wait();
	}
	catch (InterruptedException e)
	{
		System.out.println("exception caught");
	}
	}	
	System.out.println("got" +n);
	valueset=false;
	notify();
	return n;
 	}

	synchronized void put(int n)
	{	
 	  if (valueset)  //false
	{
 		  try
 		  { wait();	}
 		  catch (InterruptedException e)
 		  {System.out.println("exception caught");}
	}
 		  this.n=n;
 		  valueset=true;
 		  System.out.println("put"+n);
 		  notify();
	}

}
class Producer implements Runnable
{
	Quantity q;
	Thread t;
	Producer(Quantity q1)
	{
		q=q1;
		t=new Thread(this,"PRODUCER");
		t.start();
	}
	public void run()
	{
	int i=0;
	while (true)
	{	i++;
		q.put(i);}
}
}
class Consumer implements Runnable
{
	Quantity q;
	Thread t;
	Consumer(Quantity q1)
	{
		q=q1;
		t=new Thread(this,"CONSUMER");
		t.start();
	}
	public void run()
	{
	int i=0;
	while (true)
	{	i++;
		q.get();}
	}
}

 
class Pcproblem
{
public static void main(String args[])
{
	Quantity qq=new Quantity();
	new Producer(qq);
	new Consumer(qq);

}
}
 
