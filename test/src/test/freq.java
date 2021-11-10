package test;
import java.util.*;
class freq{
	  public static void main(String []args)
	     {
		  Scanner sc=new Scanner(System.in);
		  String s=sc.nextLine();//hello world   s[0]=h /s.charAt(0)
		  
        Map<Character, Integer> mp = new HashMap<Character, Integer>(); 

        for(int i=0;i<s.length();i++) 
        {
        	if(mp.containsKey(s.charAt(i))) 
        	{
        		mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
        	}
        	else
        	{
        		mp.put(s.charAt(i),1);
        	}
        }
        
        mp.forEach((key,value) -> System.out.println(key + " = " + value));
     }
}
 