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
	public static StringBuffer removelastcharacter(String givenstring) {
		 
	StringBuffer buf=new StringBuffer(givenstring);	
	
		StringBuffer newstring=buf.deleteCharAt(buf.length()-1);
	
		  return  newstring;	  
	}
	
	public static String removelastcharacter(StringBuffer ns, int x) {
		 
        
        String string=ns.substring(0, ns.length()-x);
		  
		return string;
	}
	
   
	
   
	public static void main(String[] args) {

		Stringlastcharremoval prg=new Stringlastcharremoval();
		
	
		StringBuffer latest=prg.removelastcharacter("Ragukumar");
		System.out.println(latest);
		Stringlastcharremoval prg1=new Stringlastcharremoval();
		String latest2=prg1.removelastcharacter(latest, 2);
		System.out.println(latest2);
	}}
		