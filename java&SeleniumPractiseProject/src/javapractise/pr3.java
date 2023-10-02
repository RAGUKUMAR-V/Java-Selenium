package javapractise;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class pr3 {
	
	public static boolean isvolwels(char c) {
		return (c=='a' || c=='e' || c== 'i' || c=='o' || c=='u' ||
				c=='A' || c=='E' || c=='I' || c=='O' || c=='U' );
		
	}
	public static String volwelsreverse(String strg) {
		
		char [] arr=strg.toCharArray();
		int j=0;
		String vow="";
		for(int i=0;i<arr.length;i++) {
			if(isvolwels(arr[i])) {
				j++;
				vow=vow+arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(isvolwels(arr[i])) {
				 arr[i]=vow.charAt(--j);
			}
		}
		return String.valueOf(arr);
		
	}
	

	public static void main(String[] args) {

		String name="aeiou";
		System.out.println(volwelsreverse(name));
		
		
		
	}
}