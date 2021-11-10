package test;

import java.util.Scanner;

public class seclargeton {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int num[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		num[i]=sc.nextInt();
	}

    int n = num.length;

    int highest=0,secondHighest=0;

    for (int i = 0; i < n; i++) { 
        if (num[i] > highest) {
          secondHighest = highest;
          highest = num[i];
       }

      if (num[i] < highest && num[i] > secondHighest) {
         secondHighest = num[i];
      }
   }

   System.out.println("Second highest " + secondHighest);

}
}
