package javapractise;

import java.util.Scanner;

public class Reversestring {

	
	public void method1() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your string :");
		String name=scan.next();
		
		char[] characters=name.toCharArray();
		String rv="";
		for(int i=characters.length-1;i>=0;i--) {
			rv=rv+characters[i];	
		}
		System.out.println(rv);
	}
	
	
	
	
	public static void main(String[] args) {
	
		
	Reversestring prog=new Reversestring();
	prog.method1();

	}

}
