package javapractise;

public class Primenumber {
	
	public static boolean primenumber(int num) {
		
		if(num<1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
				

	public static boolean prime1(int num ) {
		
		for(int i=2;i<=num;i++) {
			if(i%2==0) {
				return false;
		}
			
	}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //System.out.println(Primenumber.primenumber(27)); 
           
		System.out.println(prime1(9));
           
           
	}

}
