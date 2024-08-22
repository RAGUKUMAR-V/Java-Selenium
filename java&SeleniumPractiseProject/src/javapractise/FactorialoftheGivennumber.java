package javapractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FactorialoftheGivennumber {
	
public void factorialofgivennumber(int number) {
	
	int fact=number;
	for(int i=1;i<number;i++) {
		
		fact=fact * i;
		
	}
	System.out.println(fact);
}

public static int fact(int n) {
	
	if(n<2) {
		return n;
	}
	else {
	return	fact(n-1)* n;
	}
	
}


	

	public static void main(String[] args) {

		/*
		 * FactorialoftheGivennumber program=new FactorialoftheGivennumber();
		 * program.factorialofgivennumber(4);
		 */
		
		int ans=fact(6);
		System.out.println(ans);

	}

}
