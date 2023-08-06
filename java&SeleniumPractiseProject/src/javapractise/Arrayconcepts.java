package javapractise;

public class Arrayconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a = new String[6];
		a[0] = "Ragu";
		a[1] = "Ragu";
		a[2] = "Ragu";
		a[3] = "Ragu";
		a[4] = "Ragu";
		System.out.println(a.length);
		for (String c : a) {
			System.out.println(c);
		}
		System.out.println("*************");

		int[] b = new int[5];
		b[0] = 0;
		b[1] = 1;
		b[2] = 2;
		b[3] = 3;
		b[4] = 4;
		System.out.println(b.length);
		System.out.println(b);
		for (int d : b) {
			System.out.println(d);
		}
		System.out.println("******************");
		char cc[] = { 'r', 'a', 'g', 'u', 'v' };

		System.out.println(cc.length);

		System.out.println("-----------");

		int x = 5;
		int y = 5;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				
					System.out.print("*");
				

				
			}

			System.out.println(""); 
		}
		System.out.println("-----------");
		
		int x1=1;
		int x2=2;
		int x3=5;
		x1=x2;
		x2=x3;
		x3=x1;
		System.out.println(x3);
		
		
	}

}
