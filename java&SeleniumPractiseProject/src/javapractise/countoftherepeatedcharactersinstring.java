package javapractise;

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class countoftherepeatedcharactersinstring {

	public static void givenstring(String sen) {
		char[] words=sen.toCharArray();
		
		Map<Character,Integer>count=new HashMap<Character,Integer>();
		for(char word:words) {
			if(count.containsKey(word)) {
				count.put(word,count.get(word)+1);
			}else {
				count.put(word, 1);
		
		}
			
		}
		//System.out.println(count );
			int maxcount=0;
			String maxchar="";
			
		  Set<Character> ww=count.keySet();
		  for(char wor:ww) {
			  if(count.get(wor)>maxcount) {
				  maxcount=count.get(wor);
				  
				//  maxchar=maxchar+String.valueOf(wor);
		  } }
		  
		  for(char wor:ww) {
			  if(count.get(wor)==maxcount) {
				  System.out.println(wor + ":" +maxcount);
			  }
		  }
		 
		  
	}
	
	
	public static void main(String[] args) {
	
		
		givenstring("gologle");
				
	}

}
