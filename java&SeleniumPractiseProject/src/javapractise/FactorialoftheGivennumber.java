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


	

	public static void main(String[] args) {

		FactorialoftheGivennumber program=new FactorialoftheGivennumber();
		program.factorialofgivennumber(4);

	}

}
