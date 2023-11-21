package javapractise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveduplicateNumber {
	
public void removeduplicatenumbers(int[] number) {
	
	Set<Integer> orig=new HashSet<Integer>();
	
	for(int nu:number) {
		if(orig.add(nu)==true) {
			//orig.add(nu);
			System.out.println(nu);
			
		}
		
	}
	
}



	

	public static void main(String[] args) {

		RemoveduplicateNumber program=new RemoveduplicateNumber();
		
		
		int[] array= {1,1,2,2,2};
		program.removeduplicatenumbers(array);

	}

}
