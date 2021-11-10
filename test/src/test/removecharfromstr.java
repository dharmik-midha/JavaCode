package test;
import java.util.*;
public class removecharfromstr {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	
	System.out.println("enter char to remove: ");
	String s2=s.nextLine();
	for(int i=0;i<s1.length();i++)
	{
		if(s2.charAt(0)==(s1.charAt(i)))
		{
			s1=s1.replaceAll(s2, "");
		}
	}
	System.out.println(s1);
}
}
