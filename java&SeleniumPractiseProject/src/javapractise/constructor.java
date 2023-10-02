package javapractise;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class constructor extends constructor2{
	
	String  name1;
	int age1;
	
	
	constructor(String name1,int age1){
		name1=super.name;
		age1=super.age;
		
	}
	
	public void employee() {
		
		System.out.println(name1);
		
		
	}
	

	public static void main(String[] args) {
		
		constructor con =new constructor("ragu", 24);
		
		con.employee();
		
		ArrayList<String> array=new ArrayList<String>();
		array.add("ragu");
		array.add("poongodi");
		array.add("prathap");
		
		Iterator<String> it=array.iterator();
		
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
	}
  //Screenshot
	/*
	 * File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(src, new File("//D://screenshot.png"));
	 */
	
	//Scrolling
	/*
	 * JavascriptExecutor js= (JavascriptExecutor)driver;
	 * js.executeScript("window.scrollBy(0,1900)");
	 */
	
	//windows Handles
	
	

}
