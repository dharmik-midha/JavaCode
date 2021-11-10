package TCP;
import java.io.*;
import java.util.*;
import java.net.*;
public class clientexample
{
  public static void main(String arg[])
  {    
   try{
	   Socket cs;
	//cs=new Socket("196.100.10.10",8080); // other machine
	 cs=new Socket("127.0.0.1", 8000); // local machine
	InputStream in=cs.getInputStream();
	BufferedReader br=new BufferedReader(new InputStreamReader(in));
	String s=br.readLine();
	System.out.println(s);
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	String st=br1.readLine();
	PrintStream ps=new PrintStream(cs.getOutputStream());
	ps.println(st);
	System.out.println(br.readLine());
	cs.close();
      }
   catch(Exception e)
   {
	   System.out.println(e);
   }
  }
}
