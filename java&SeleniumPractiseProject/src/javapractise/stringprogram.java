package javapractise;

import java.util.ArrayList;
import java.util.List;

public class stringprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word="ragukumar";
		int sum=0;
		char input='a';
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==input) {
				sum++;
			}
		}
		System.out.println(sum);
		
		String name="Ragukumar@1409";
		String integer="";
		String characters="";
		String special="";
		for(int i=0;i<name.length();i++) {
			if(Character.isDigit(name.charAt(i))) {
				integer=integer+name.charAt(i);
			}else if(Character.isAlphabetic(name.charAt(i))) {
				characters=characters+name.charAt(i);
			}else{
				special=special+name.charAt(i);
			}
			
		}
		
         System.out.println(integer);
         System.out.println(characters);
         System.out.println(special);
         
         
         List<String>array=new ArrayList<String>();
         array.add("Ragu");
         array.add("kumar");
         array.add("Ragu");
         
	}

}
