package FileOutputStream;
import java.io.*;

public class FileWriteFunction {
public static void main(String arg[])
{
try {
FileOutputStream fos=new FileOutputStream("C:\\Users\\dharm\\Desktop\\Example\\example1.txt");

	String s="ABCDEF ";
	byte b[]=s.getBytes();

	for(int i=0;i<b.length;i++)
	{
		fos.write(b[i]);
	}		
	String s1="Hello World ";
	byte b1[]=s1.getBytes();
	fos.write(b1);

	String s3="This is an example ";
	byte b2[]=s3.getBytes();
	fos.write(b2,1,4);
	}
	catch(IOException e) 
		{System.out.println(e);
     }
    }
}
