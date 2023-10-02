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
			
		  Set<Character> ww=count.keySet();
		  for(char wor:ww) {
			  if(count.get(wor)>0) {
		  System.out.println(wor + ":" +count.get(wor)); } }
		 
	}
	
	
	public static void main(String[] args) {
	
		givenstring("ragukumar");
		
		
		
	}

}
