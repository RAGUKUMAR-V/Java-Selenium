package javapractise;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 1 2 3 5 8 13 21 34
		
		int a=0,b=1,sum=0;
		
		System.out.print(a + " "+ b);
		
		for(int i=2;i<10;i++) {
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		
		
	}

}
