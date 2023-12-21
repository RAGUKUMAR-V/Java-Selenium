package javapractise;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HighestRepeatedCharacterInString {

	public static void main(String[] args) {

		  String str = "google zoho";
	        
	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCount = new HashMap<>();

	        // Iterate through each character in the string
	        for (char ch : str.toCharArray()) {
	            if(charCount.containsKey(ch)){
	                 charCount.put(ch, charCount.get(ch) + 1);
	                
	            }else{
	                charCount.put(ch, 1);
	            }
	           
	        }

	        // Find the character with the maximum count
	        Set<Map.Entry<Character, Integer>> wor= charCount.entrySet();
	        
	        char maxChar = '\0';
	        int maxCount = 0;
	        for (Map.Entry<Character, Integer> entry : wor) {
	            if (entry.getValue() > maxCount) {
	                maxChar = entry.getKey();
	                maxCount = entry.getValue();
	            }
	        }

	         System.out.println(maxChar + " is repeating "+ maxCount+" times");


		
		
		
		
	}

}
