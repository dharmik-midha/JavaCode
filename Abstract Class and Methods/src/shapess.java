import java.io.*;

abstract class shapes
{
	int side,breadth,length;
	shapes(int s,int s1)
	 {
		if(s==s1) 
		{   side=s;
		     System.out.println("side of a squaree is "+side);    // abstract class can have non-abstract classes
		}
		else
		{    length=s;
		      breadth=s1;
		   System.out.println("length of rectangle is "+length+" and \nbreadth of rectangle is "+breadth);  
                                       // abstract class can have non-abstract classes
		}
	}
	abstract void area();
	abstract void parameter();
                 // abstract method does not have implimentation in abstract class it will be available in sub-class
}
class rectangle extends shapes{ 
	int length;
	int breadth;
	rectangle(int l,int b)
{	super(l,b);
		length=l;
		breadth=b;		
	}
	void area(){System.out.println("Area of Rectangle is "+length*breadth);}
	void parameter(){int parameter=2*(length+breadth);System.out.println("Parameter of Rectangle is "+parameter);}
}
class squaree extends shapes {
	int side1;
	
	 squaree(int s1,int s2) 
{	super(s1,s1);
		side1=s2;	}
	
	void area()				//abstract method area
	{ System.out.println("Area of squaree is "+side1*side1);
	}
	
	void parameter() 	//abstract method parameter
	{System.out.println("Parameter of squaree is "+4*side1);
	}}

class shapess{          public static void main(String arg[]) {
		shapes sh;
		squaree sq=new squaree(20,30);
		rectangle re=new rectangle(50,60);
			sh=sq;
			sh=re;
			sq.area();
			sq.parameter();
			re.area();
			re.parameter();
	}	
}
