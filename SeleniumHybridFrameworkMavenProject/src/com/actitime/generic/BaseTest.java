package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	
	public static WebDriver driver;
	static{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(IE_KEY, IE_VALUE);
	}
	
	@BeforeMethod
	public void openApplication(){
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		String url = Lib.getPropertyValue("URL");
		driver.get(url);
		String ito = Lib.getPropertyValue("ImplicitWait");
		long timeout = Long.parseLong(ito);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication(){
		driver.close();
	}
}
