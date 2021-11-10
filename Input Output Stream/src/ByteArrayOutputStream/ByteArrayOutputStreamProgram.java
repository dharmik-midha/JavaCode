package ByteArrayOutputStream;
import java.io.*;

public class ByteArrayOutputStreamProgram {

	public static void main(String arg[])
	{
	try {
	  ByteArrayOutputStream baos1=new ByteArrayOutputStream();
	  String s="My Name is Dharmik";
	  byte b[]=s.getBytes();
	  baos1.write(b);	//write 
	  System.out.println(baos1.toString());	//print 
	  byte b1[]=baos1.toByteArray();	//converting into byte array
	  FileOutputStream fos= new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\ByteArrayOutputStream.txt");
 //to write in file ByteArrayOutputStream.txt
	  baos1.writeTo(fos);	//write ByteArrayOutputStream to FileOutputStream
		}
	catch(IOException e)
	{
	System.out.println(e);
	}
       } 
}
