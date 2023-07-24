package javapractise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuranceoftheCharacter {
	
public void removeduplicatenumbers(String name) {
	char[] charcters=name.toCharArray();
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	
	for(Character ch:charcters) {
		
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}else {
			map.put(ch,1);
		}
	}
	Set mm=map.entrySet();
	Iterator mp=mm.iterator();
	while(mp.hasNext()) {
		Map.Entry m=(Map.Entry)mp.next();
		System.out.print(m.getKey()+ " :"); 
		System.out.println(m.getValue());
		
		
	}
	System.out.println();
	}
	



	

	public static void main(String[] args) {

		OccuranceoftheCharacter program=new OccuranceoftheCharacter();
		
	String string= "rragukumar";
		program.removeduplicatenumbers(string);

	}

}
