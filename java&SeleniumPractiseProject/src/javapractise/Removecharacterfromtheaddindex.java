package javapractise;

public class Removecharacterfromtheaddindex {

	public static String removechar(String given) {
		String removed="";
		for(int i=0;i<given.length();i++) {
			if(i==0) {
				String zindex=String.valueOf(given.charAt(i));
				String ind=zindex.toUpperCase();
				removed=removed+ind;	
			}else if (i%2==0) {
				String conver=String.valueOf(given.charAt(i));
				String upcase=conver.toUpperCase();
				removed=removed+upcase;
				
			}
		}
		return String.valueOf(removed);
	}
	
	
	public static void main(String[] args) {
		String given="ragukumar";
		//r=0 , a=1, g=2, u=3, k=4, u=5, m=6, a=7, r=8
		System.out.println(removechar(given));

	}

}
