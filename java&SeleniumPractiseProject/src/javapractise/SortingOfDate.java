package javapractise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingOfDate {

	public static void main(String[] args) {
	
		ArrayList<String> dateList = new ArrayList<>();
		dateList.add("01 Jan 2023");
		dateList.add("25 Dec 2022");
		dateList.add("15 May 2023");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
		Comparator<String> dateComparator = (s1, s2) -> LocalDate.parse(s2, formatter)
				.compareTo(LocalDate.parse(s1, formatter));

		Collections.sort(dateList, dateComparator);

		
		for (String date : dateList) {
		    System.out.println(date);
		}
		
		
		
		
	}

}
