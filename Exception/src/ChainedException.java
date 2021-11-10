public class ChainedException{

	
		static void DemoPro() throws Exception
			{
			NullPointerException e=new NullPointerException("top layer");
			e.initCause(new ArithmeticException("cause"));
			 throw e;
			 }
		
		public static void main(String arg[]) throws Exception 
		{
			try 
			{ 	ChainedException.DemoPro(); }
		
			catch(NullPointerException e) 
			{	System.out.println("caught ->"+e);
				System.out.println("original cause-> "+e.getCause());
			
		}
		}
		
}
