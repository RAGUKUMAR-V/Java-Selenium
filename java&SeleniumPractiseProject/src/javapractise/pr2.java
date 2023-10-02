package javapractise;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class pr2 {

	public static void main(String[] args) {

		String name="ragukumar";

		char[] charc=	name.toCharArray();


		Map<Character,Integer>mapp=new HashMap<Character,Integer>();

		for(Character ch:charc) {
			if(mapp.containsKey(ch)) {
				mapp.put(ch,mapp.get(ch)+1);
			}else {
				mapp.put(ch,1); 	
			}

		}


		Set<Character>mm=mapp.keySet();
		for(char worrd:mm) {
			if(mapp.get(worrd)>1) {
				System.out.println(worrd + ":"+ mapp.get(worrd));
			}
		}

	}
}