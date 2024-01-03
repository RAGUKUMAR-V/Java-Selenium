package javapractise;

public class OnlyStringReverse {


	public static void main(String[] args) {

		String s = "4321ra";
		String reverse = "";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			} else {
				str = str + s.charAt(i);
                // System.out.println(str);
                 
				if (i == s.length() - 1 || Character.isDigit(s.charAt(i + 1))) {
					for (int j = str.length() - 1; j >= 0; j--) {
						reverse = reverse + str.charAt(j);
					}

					System.out.print(reverse);

					reverse = "";
					str = "";

				}

			}

		}

		
		
	}

}
