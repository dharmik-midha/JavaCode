import java.io.*;

class Box
{		
		float l;
		float b;
		float h;
		
		Box()
		{	l=0;
			b=0;
			h=0;
			System.out.println("length ="+l+" breadth="+b+" height="+h);
		}
		
		Box(float l1,float b1,float h1)
		{
			 l=l1;
			 b=b1;
			 h=h1;
		
			System.out.println("length ="+l+" breadth="+b+" height="+h);
 		}
		
		Box(float h2)
		{	l=25;
			b=30;
			h=h2;
		
		System.out.println("length ="+l+" breadth="+b+" height="+h);
		}
		
		public static void main(String arg[])
		{	Box b=new Box();
			Box b1=new Box(5,10,20);
			Box b2=new Box(35);
}}
