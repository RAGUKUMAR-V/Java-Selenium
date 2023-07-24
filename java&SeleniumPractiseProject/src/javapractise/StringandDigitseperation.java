package javapractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringandDigitseperation {



	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input value  :");
		String ss=scan.next();
		char[] charr=ss.toCharArray();
		String or = "";
		String nu = "" ;
		
		for(Character ch:charr) {
			
			if(ch.isAlphabetic(ch)) {
				
				//String.valueOf(ch);
				
				or=or+ch;
			}else {
			
				nu=nu +ch;
			}
			
		}
		System.out.println("Name is :"+ or);
		System.out.println("DOB is :" + nu);

	}

}
