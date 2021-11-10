package test;
import java.util.Scanner;

public class mostfreqchar {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
        
        int count[] = new int[256]; //plotting ascii table
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++; //counting the i-th character of a string and assign in ascii table
       
        int max = -1;  
        char result = ' '; 
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) 	//comparing the i-th character of a string and finding most occuring character
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        System.out.println("Max occurring character is " +result);
    }
}
