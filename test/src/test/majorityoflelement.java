package test;
import java.util.*;
public class majorityoflelement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int a[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	   int maxCount = 0;
       int index = -1; 
       for (int i = 0; i < size; i++) {
           int count = 0;
           for (int j = 0; j < size; j++) {
               if (a[i] == a[j])
                   count++;
           }
           if (count > maxCount) {
               maxCount = count;
               index = i;
           }
       }
	if(maxCount>(size/2))
		System.out.println("Majority found: "+a[index]);
	else
		System.out.println("No majority found");
}
}
