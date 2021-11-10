package test;
import java.util.*;

class Test4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	        SortedMap<Integer, Integer> mapStr = new TreeMap<>();
	        
	        for (int i=0 ; i < n ; i++){
	        	
	        	int num=sc.nextInt();
	            if (!mapStr.containsKey(num)){
	                mapStr.put(num,1);
	            } else{
	                mapStr.put(num,mapStr.get(num)+1);
	            }
	        }
	        for (Map.Entry<Integer,Integer> map:mapStr.entrySet()) {
	        	
	            if(map.getValue()==1) {   
	        	System.out.print((int)map.getKey());
	        	System.out.print(" ");
	        }
	        }
	              
	}
}
