package javapractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringandDigitseperation {



	public static void main(String[] args) {


		String ss="ra14gu09";
		char[] charr=ss.toCharArray();
		String or = "";
		String nu = "" ;

		for(Character ch:charr) {

			if(ch.isAlphabetic(ch)) {

				or=or+ch;
			}else {

				nu=nu +ch;
			}

		}
		System.out.println("Name is :"+ or);
		System.out.println("DOB is :" + nu);

	}

}
