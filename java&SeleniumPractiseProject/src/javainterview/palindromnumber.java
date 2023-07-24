package javainterview;

public class palindromnumber {
	
	
	public void palindromnum(int num) {
		int r=0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("Palindrom number");
		}else {
			System.out.println("Not Palindrom number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		palindromnumber pali=new palindromnumber();
		
		pali.palindromnum(1002);
		
	}

}
