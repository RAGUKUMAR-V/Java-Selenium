package javapractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Removeduplicatecharacter {

	
	public void method1(String word) {
		char[] charac=word.toCharArray();
		Set<Character> set=new HashSet<Character>(); 
		for(char ch:charac) {
			if(set.add(ch)==true) {
				System.out.print(ch);			
			}	
		}
			
	}
		
	public static void main(String[] args) {
	
		
	Removeduplicatecharacter prog=new Removeduplicatecharacter();
	prog.method1("ragukumar");

	}

}
