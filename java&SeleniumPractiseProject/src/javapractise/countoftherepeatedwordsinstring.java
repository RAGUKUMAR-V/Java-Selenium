package javapractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countoftherepeatedwordsinstring {

	public static void givenstring(String sen) {
		String[] words=sen.split(" ");
		
		Map<String,Integer>count=new HashMap<String,Integer>();
		for(String word:words) {
			if(count.containsKey(word)) {
				count.put(word.toLowerCase(),count.get(word)+1);
			}else {
				count.put(word, 1);
		
		}
			
		}
		//System.out.println(count );
		
		  Set<String> ww=count.keySet();
		  for(String wor:ww) {
			  if(count.get(wor)>1) {
		  System.out.println(wor + ":" +count.get(wor)); } }
		 
	}
	
	
	public static void main(String[] args) {
	
		givenstring("ragu very ragu very much");
		
		
		
	}

}
