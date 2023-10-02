package javapractise;

public class SumOfTheNumberIsPalindrom {

	public static void main(String[] args) {

		Integer number = 29;

		String converted = String.valueOf(number);

		int sum = 0;

		String reverse = "";

		for (int i = 0; i < converted.length(); i++) {

			sum = sum + Character.getNumericValue(converted.charAt(i));
		}
		System.out.println(sum);

		String convertnumber = String.valueOf(sum);

		for (int i = convertnumber.length() - 1; i >= 0; i--) {

			reverse = reverse + convertnumber.charAt(i);
		}

		if (reverse.equals(convertnumber)) {
			System.out.println("Palindrom number ");
		} else {
			System.out.println("Not a Palindrom number");
		}
		System.out.println(reverse);

	}
}
