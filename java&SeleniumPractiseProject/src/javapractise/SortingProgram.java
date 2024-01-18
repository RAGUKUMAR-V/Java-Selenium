package javapractise;

public class SortingProgram {
	

	public static void main(String[] args) {
		
		  String input = "zxsd121323";
	        char[] chars = input.toCharArray();
           
	        // Bubble sort in reverse order
	        for (int i = 0; i < chars.length - 1; i++) {
	            for (int j = 0; j < chars.length- 1; j++) {
	                if (chars[j] > chars[j + 1]) {
	                    // Swap characters
	                    char temp = chars[j];
	                    chars[j] = chars[j + 1];
	                    chars[j + 1] = temp;
	                }
	            }
	        }

	        String sorted = new String(chars);
	       
	        System.out.println(sorted); 
		
		

	}

}
