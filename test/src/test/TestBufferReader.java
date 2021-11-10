package test;
import java.io.*;
import java.util.*; 

public class TestBufferReader {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> arr= new ArrayList<>(); 
		for (int i = 0; i<n; i++) {

			arr.add(sc.next());
	}
		arraySort(arr);
	}
	static void arraySort(ArrayList<String> arr) {
		int n=arr.size();
		Collections.sort(arr);
		 for (int i=0 ;i<n; i++)
		    {
		        String temp = arr.get(i);
		        int j = i - 1;
		        while (j >= 0 && temp.length() < arr.get(j).length())
		        {
		            arr.set(j+1,arr.get(j));
		            j--;
		        }
		        arr.set(j+1, temp);
		    }
		 for (int i=0;i<n;i++)
	      { 		      
	           System.out.print(arr.get(i)+" "); 		
	      }
	           
	}
}