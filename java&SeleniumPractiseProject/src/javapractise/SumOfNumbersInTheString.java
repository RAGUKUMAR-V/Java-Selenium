package javapractise;

public class SumOfNumbersInTheString {

	public static void main(String[] args) {


		  String s ="4PRE 215PINST 11AA6";
		   int sum=0;
		   for (int i = 0; i < s.length(); i++) {
		      if(Character.isDigit(s.charAt(i))) 
		      sum=sum+Character.getNumericValue(s.charAt(i));
		      }
		   System.out.println("Sum of all the digit present in String : "+sum);

	}

}
