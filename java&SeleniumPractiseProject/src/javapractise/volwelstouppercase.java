package javapractise;

public class volwelstouppercase {
	
	
	public void methods(String name) {
		
		int leg=name.length();
		
		for(int i=0;i<leg;i++) {
			
				if(name.charAt(i)!='a' & name.charAt(i)!='e' & name.charAt(i)!='i' & name.charAt(i)!='o' & name.charAt(i)!='u'  ) {
					
					
					System.out.print(name.charAt(i));
					
			}else {
				//char letter=name.charAt(i);
				String let=String.valueOf(name.charAt(i));
				System.out.print(let.toUpperCase());
				
			}
				
			}
			
		}
		
	
	public static void main(String[] args) {
	
		
		volwelstouppercase concepts=new volwelstouppercase();
		concepts.methods("ragukumar");
		
		
		
		
	}

}
