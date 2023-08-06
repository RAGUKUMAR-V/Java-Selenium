package javapractise;

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
	
	public void palind(int nm) {
		String reverse="";
		
		String convertednumber=String.valueOf(nm);
		int leg=convertednumber.length();

		for(int i=leg-1;i>=0;i--) {
			reverse=reverse+convertednumber.charAt(i);
		}
		if(convertednumber.equals(reverse)) {
		System.out.println("given is palindrom");
	}else{
		System.out.println("given is not palindrom");
	}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		palindromnumber pali=new palindromnumber();
		
		//pali.palindromnum(1002);
		pali.palind(112);
	}

}
