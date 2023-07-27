package Testngpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Listener extends soucelabpractice implements ITestListener{
	WebDriver driver;
	  public Listener(WebDriver driver) { 
		 super.driver=driver;
		  
	  }	
	 
@AfterMethod
	public void onTestFailure(ITestResult result, WebDriver driver) {
	 Listener lis=new Listener(driver);
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(file,new File("\\practiseproject\\target\\screenshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
}
