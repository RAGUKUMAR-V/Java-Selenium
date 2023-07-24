package newjavapractice;

public class preandpostincrement {
int x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=a++;
		System.out.println("a value is :"+a);
		System.out.println("b value is :"+b);
		
		int c=2;
		int d=++c;    
		System.out.println("c value is :"+c);
		System.out.println("d value is :"+d);
		
		String s="5";
	int r=Integer.parseInt(s);
		
		System.out.println(r+10);
		
		
		preandpostincrement preandpostincrement=new preandpostincrement();
		preandpostincrement.x=10;
		preandpostincrement.y=20;
		preandpostincrement.swap(preandpostincrement);
	}
	
	
	public void swap(preandpostincrement t) {
		int z;
		 z=t.x;
		x=t.y;
		y=z;
		
		
	}

}
