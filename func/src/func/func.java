package func;
import java.io.*;
/*
 * Types of functions
 * constructor
 * Accessor Function/ Selector Function
 * Mutator Function
 * Utility Function	
 * */

class func {

	String name;
	int age;
	//1Default COnstructor
	 func(){
		this.name="Akshita Anand";
		this.age=21;
	}
	
	//2)parameterized constructor
	func(String n,int a){
		this.name=n;
		this.age=a;
	}
	
	//copy constructor
	
	public static void main(String args[])
	{
		func f= new func();
		System.out.println(f.name+f.age);
		func f1=new func("Dharmik",21);
		System.out.println(f1.name+f1.age);
	}
}
