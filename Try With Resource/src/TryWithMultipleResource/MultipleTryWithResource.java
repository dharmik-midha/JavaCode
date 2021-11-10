package TryWithMultipleResource;
/*Q. wap in which you have a string i love java classes, using a stream you have to write a string in a file 
 * a.txt, after writting to the file, you will again append another content to your file, we do lots of hands on 
 * exercises. You will open a file for reading and copy the content to bb.txt.
 */


import java.io.*;
public class MultipleTryWithResource {
public static void main(String arg[]) {
try (FileOutputStream fos=new FileOutputStream("C:\\Users\\Dharm\\Desktop\\Example\\aa.txt",true);
         FileInputStream fis=new FileInputStream("C:\\Users\\Dharm\\Desktop\\Example\\aa.txt");
           FileOutputStream fos1=new FileOutputStream("C:\\Users\\Dharm\\Desktop\\Example\\bbb.txt"); )
	{	String s1="i love java class";
		String s2="We do lots of hands on exercise";
		byte b1[]=s1.getBytes();
		byte b2[]=s2.getBytes();
		fos.write(b1);
		fos.write(b2);
		//reading 
		for(int i=0;i<5;i++)
		{
			System.out.println("In byte form : "+fis.read());// print bytes	// first from of read
		}

		int i;
		while((i=fis.read())!=-1)
		{
			fos1.write(i);
		}
	}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
