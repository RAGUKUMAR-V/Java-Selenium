package javapractise;

import java.util.Scanner;

public class Reversestring {

	
	public void method1() {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your string :");
		String name=scan.next();
		
		//char[] characters=name.toCharArray();
		String rv="";
		for(int i=name.length()-1;i>=0;i--) {
			rv=rv+name.charAt(i);	
		}
		System.out.println(rv);
	}
	
	
	
	
	public static void main(String args[]) {
	
		
	Reversestring prog=new Reversestring();
	prog.method1();

	String s="ragu";
	StringBuffer buff=new StringBuffer(s);
	StringBuffer reversed=buff.reverse();
	
	System.out.println(reversed);
	
	int num=5;
	int fac=num;
	
	for(int i=num-1;i>0;i--) {
		fac=fac*i;
	}
	System.out.println(fac);
	}

}
