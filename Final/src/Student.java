import java.io.*;

class xyz{
	final String name="Dharmik";
	int age=22;
	//final in method prevent method to override
	final void print() {
	//	name="Dhanik"; can't change value of final instance variable
		System.out.println(name);
		System.out.println(age);
	}
	
}
class pqr extends xyz{
//	void print() {
//		 
//	}
	//display error
}

class Student{
	public static void main(String[] args) {
		xyz ob=new xyz();
		ob.print();
		
	}
}