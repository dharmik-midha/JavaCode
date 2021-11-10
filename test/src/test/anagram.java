package test;
import java.util.*;
public class anagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();	//Hitler Woman
	String s2=sc.nextLine();	//Mother in Law
	
	boolean status;
	
	if(s1.length()!=s2.length())	//11=11
	{
		status=false;
	}
	else
	{
	   char[] ArrayS1 = s1.toLowerCase().toCharArray();  
       char[] ArrayS2 = s2.toLowerCase().toCharArray();  
       Arrays.sort(ArrayS1);  //aehilmnortw
       Arrays.sort(ArrayS2);  //aehilmnortw
       status = Arrays.equals(ArrayS1, ArrayS2);  
	}
	if(status) 
		System.out.println(s1+" and "+s2+" are anagram");
	else
		System.out.println(s1+" and "+s2+" are not anagram");
}
}
