package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	
	String name;
	int age;
	String desig;
	Employee(String name, int age, String designation) {
		
		this.name=name;
		this.age=age;
		this.desig=designation;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee arr1=new Employee("Ragu", 24, "Test Analyst");
		Employee arr2=new Employee("Kiran", 25, "Test Analyst");
		Employee arr3=new Employee("Ajith", 26, "Test Analyst");
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(arr3);
		list.add(arr2);
		list.add(arr1);
		
		Iterator<Employee>emp=list.iterator();
		while(emp.hasNext()) {
			Employee ep1=emp.next();
			System.out.println(ep1.name);
			System.out.println(ep1.age);
			System.out.println(ep1.desig);
		}
		
		System.out.println("****************************");
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("java");
		list1.add("selenium");
		list1.add("appium");
		list1.add("cucumber");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("testng");
		list2.add("java");
		list2.add("jemeter");
		list2.add("cucumber");
		//list1.addAll(list2);
		list1.retainAll(list2);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
		
	
	}

}
