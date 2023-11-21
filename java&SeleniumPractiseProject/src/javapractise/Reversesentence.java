package javapractise;

import java.util.Scanner;

public class Reversesentence {

	
	public static void method1(String sen) {
		/*
		 * Scanner scan=new Scanner(System.in);
		 * 
		 * System.out.println("Enter your string :"); String sentence=scan.next();
		 */
		
		
		
		String[] words=sen.split(" ");
		String rv="";
		for(int i=words.length-1;i>=0;i--) {
			rv=rv+" " +words[i];	
		}
		System.out.println(rv);
	}
	
	
	
	
	public static void main(String[] args) {
	
		
	//Reversesentence prog=new Reversesentence();
	method1("i love ragu");

	}

}
