package ResourceBlock;
import java.io.*;
public class FileReadFunctions
{
public static void main(String arg[])
{
try
(FileInputStream fis=new FileInputStream("C:\\Users\\Dharm\\Desktop\\Example\\example.txt"))
{System.out.println("no. of byte available : "+fis.available());

for(int i=0;i<5;i++)
{
System.out.println("In byte form : "+fis.read());// print bytes	// first from of read
}
for(int i=0;i<5;i++)
{ System.out.println("In Character form : "+(char)fis.read()); // read character
}
byte b[]=new byte[20];
{	fis.read(b);						// second form of read
String s=new String(b);
System.out.println("read next byte(using second form) : "+s);
}
byte b1[]= new byte[20];
{	fis.read(b1,5,10);
String s1=new String(b1);
System.out.println("read next byte(using third form)  : "+s1);	//third form of read (byte b[],int offset, int n bytes)
}
int available=fis.available();
byte b2[]=new byte[available];
fis.read(b2);
String s1=new String(b2);
System.out.println(s1);

}
catch(IOException e)
{System.out.println("input output error");}
}
}
