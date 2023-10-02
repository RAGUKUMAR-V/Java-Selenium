package JavaCollections;

public class constructor {
	
	String  name;
	int age;
	float salary;
	
	constructor(String peru, int vayasu){
		this.name=peru;
		this.age=vayasu;
		
	}
	
	public void employee() {
		
		System.out.println(name);
		
		
	}
	

	public static void main(String[] args) {
		
		constructor con =new constructor("ragu", 24);
		
		con.employee();
	}




}
