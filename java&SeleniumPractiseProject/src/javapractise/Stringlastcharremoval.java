package javapractise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Stringlastcharremoval {
	String ss;
	public static String removelastcharacter(String givenstring) {
		 
	StringBuffer buf=new StringBuffer(givenstring);	
	
		StringBuffer newstring=buf.deleteCharAt(buf.length()-1);
		String news=String.valueOf(newstring);
	
		  return  news;	  
	}
	
	public static String removelastcharacter(String ns, int x) {
		 
        
        String string=ns.substring(0, ns.length()-x);
		  
		return string;
	}
	
   
	
   
	public static void main(String[] args) {

		Stringlastcharremoval prg=new Stringlastcharremoval();
		
	
		String latest=prg.removelastcharacter("Ragukumar");
		System.out.println(latest);
		Stringlastcharremoval prg1=new Stringlastcharremoval();
		String latest2=prg1.removelastcharacter(latest, 2);
		System.out.println(latest2);
	}}
		