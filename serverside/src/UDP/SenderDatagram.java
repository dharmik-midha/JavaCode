package UDP;
import java.net.*;
public class SenderDatagram {
//sender side
public static void main(String arg[]) throws Exception
{
DatagramSocket s = new DatagramSocket();
String s1="hello Dharmik";
String s2="hello Sir";
byte b[]=s1.getBytes();
byte b1[]=s2.getBytes();
InetAddress add=InetAddress.getByName("127.0.0.1"); //our local machine //("196.10.1.20")other machine
DatagramPacket dp= new DatagramPacket(b,b.length,add,3030);
DatagramPacket dp1= new DatagramPacket(b1,b1.length,add,3030);
System.out.println("sender side");
s.send(dp);
s.send(dp1);
s.close();
 }
}
