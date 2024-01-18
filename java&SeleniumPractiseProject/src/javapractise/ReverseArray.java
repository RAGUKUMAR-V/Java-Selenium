package javapractise;

import java.lang.reflect.Array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String[] arr= {"ragukumar"};
        
        System.out.println("own logic");
       reverse(array);
   
       strreverse(arr);
        
    }


    
    public static void reverse(int [] arr) {
    	int[] newarr= new int[arr.length];
    	int cou=0;
    	for(int j=arr.length-1;j>=0;j--) {
    		
    		newarr[cou]=arr[j];
    		cou++;
    		
    	}
    	
    	for(int k=0;k<newarr.length;k++) {
    		System.out.print(newarr[k]);
    	}
    	System.out.println();
    	
    	//return newarr;
    	
    }
    
    public static void strreverse(String [] arr1) {
    	String[] narr= new String[arr1.length];
    	int cou=0;
    	for(int j=arr1.length-1;j>=0;j--) {
    		
    		narr[cou]=arr1[j];
    		cou++;
    		
    	}
    	
    	for(int k=0;k<narr.length;k++) {
    		System.out.print(narr[k]);
    	}
    	System.out.println();
    	
    	//return newarr;
    	
    }

   
}
