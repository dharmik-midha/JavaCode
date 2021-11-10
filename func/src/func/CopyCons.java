package func;
import java.io.*;

class CopyCons {

	int n;
	
	CopyCons(int x)
	{
		n=x;
	}
	
	void show()
	{
		System.out.println(n);
	}
	
	void sum(CopyCons ob1)
	{
		n=n+ob1.n;
	}
	
	public static void main(String args[])
	{
		CopyCons c=new CopyCons(10);
		CopyCons c1=new CopyCons(11);
		c.sum(c1);
		c.show();
	}
}
