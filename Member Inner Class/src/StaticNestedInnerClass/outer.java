package StaticNestedInnerClass;
import java.io.*;
//staticnestedclassexample
public class outer{
	
private String var="Dharmik" ; //instance variable
static String var1="Midha"; 

static class Inner{
   void msg(){
   //System.out.println(var); // shows error
   System.out.println("value of static variable is "+var1);
   }
}
public static void main(String arg[])
{ outer.Inner in =new outer.Inner();
	 in.msg();
}
}
