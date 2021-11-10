package NonStaticLocalInnerClass;
import java.io.*;

public class outer
{
	 private String Name="Dharmik"; // instance variable
	  
	 void display()
	  {
		  int value=50; // local variable
	  //localinnerclass
		class local{ void msg(){  System.out.println("My Name is "+Name);}}
	    local l=new local();
	    l.msg();
	  }

	 public static void main(String arg[])
	 { outer o=new outer();    
//if we try to create object of inner class here it will generate error
	   o.display();
	 }
}
