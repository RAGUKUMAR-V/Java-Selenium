package javapractise;

public class Occuranceofthestring {

	public static void givenstring(String name) {
		
		String[] newstr=name.split(" ");
		
		
		int count = 0;
		for(String str:newstr) {
			
			if(str=="ragu") {
				count++;
			}
		
		}
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		givenstring("ragu love ragu love");
	}

}
