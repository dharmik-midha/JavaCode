package NonStaticAnonymousInnerClass;
import java.io.*;

interface moneychanger{
void ruppeetodollar(int ruppee);	
}

public class moneyconverter  {
	 public static void main(String arg[])
	 { 

	   moneychanger mc=new moneychanger(){
		   	int dollar;
			   public void ruppeetodollar (int ruppee)
			   { 
				  System.out.println("In Dollar's = "+ruppee*70); 
			   }
			   };
	 	mc.ruppeetodollar(14);
	  }
	}
