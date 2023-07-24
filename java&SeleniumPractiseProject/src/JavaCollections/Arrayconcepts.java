package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arrayconcepts {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(6);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		Collections.sort(ar);
		System.out.println(ar);
		
		int[] ab = { 1, 2, 4, 5, 0, 1, 8, 6, 3 };
		Arrays.sort(ab);
		
		for (int i = 0; i < ab.length; i++) {
			System.out.print(ab[i]);
		}

	}

}
