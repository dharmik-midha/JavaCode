package UDP;
import java.net.*;
public class RecieverDatagram {
	//reciever side
    public static void main(String arg[]) throws Exception
{
    DatagramSocket ds = new DatagramSocket(3030);
    byte b[]=new byte[1024];
    System.out.println("receive");
    byte b1[]=new byte[1024];
    DatagramPacket dp= new DatagramPacket(b,b.length);
    DatagramPacket dp1= new DatagramPacket(b1,b1.length);
    ds.receive(dp);
    ds.receive(dp1);
    String s3=new String(dp.getData(),0,dp.getLength());
    String s4=new String(dp1.getData(),0,dp1.getLength());
    System.out.println(s3);
    System.out.println(s4);
    ds.close();
}
}
