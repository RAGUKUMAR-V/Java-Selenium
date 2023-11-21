package javapractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MinimunNumber {


	public void method1(int [] numbers) {

		int min=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(min>numbers[i]) {
				min=numbers[i];
			}

		}
		System.out.println(min);

	}


	public static void main(String[] args) {


		MinimunNumber prog=new MinimunNumber();
		int[] num={2,56,80,2,3,0};
		prog.method1(num);

	}

}
