package test;
import java.util.Scanner;
import java.util.*;

class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		  String [] arr = str.split("");
	        Map<String, Integer> mapStr = new LinkedHashMap<>();

	        for (int i=0 ; i < arr.length ; i++){
	            if (!mapStr.containsKey(arr[i])){
	                mapStr.put(arr[i],1);
	            } else{
	                mapStr.put(arr[i],mapStr.get(arr[i])+1);
	            }
	        }

	        for (Map.Entry<String,Integer> map:mapStr.entrySet()) {
	            if(map.getValue()>1) {   
	        	System.out.print(map.getKey());            
	        }
	        }
	        for (Map.Entry<String,Integer> map:mapStr.entrySet()) {
	        	if(map.getValue()==1) {
	        	System.out.print(map.getKey());            
	        }
	        }       
	}
}
