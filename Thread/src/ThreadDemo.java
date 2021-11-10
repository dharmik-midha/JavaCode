import java.io.*;

public class ThreadDemo {

public static void main(String arg[]){

Thread t=Thread.currentThread();	// it will store the information of thread in t
System.out.println("the thread name is :"+t.getName());	//return string
System.out.println("the thread priority is : "+t.getPriority()); //return int
System.out.println("the thread is alive : "+t.isAlive());	//return boolean value
}
}
