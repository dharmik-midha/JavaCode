import java.io.*;

interface vconstants{

final static double pi=3.14;
final static double radius=5.7;
final static double height=8;
}

class cylinder implements vconstants
{
		double area()
{return (2*pi*radius*height)+(2*pi*radius*radius);	}
		double volume()
{return pi*radius*radius*height;		}

class circle implements varconstants
	{
		double circumference()
{return 2*pi*radius;}
		double area()
{return pi*radius*radius;}
	}
}
class shapes{
public static void main(String arg[]){
circle c=new circle();
cylinder c1=new cylinder();
System.out.println("area is "+c.area());
System.out.println("circumference is"+c.circumference());
System.out.println("area of cylinder is "+c1.area());
System.out.println("volume of cylinder is "+c1.volume());
   }

}
