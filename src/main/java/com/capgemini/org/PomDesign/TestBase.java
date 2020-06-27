package com.capgemini.org.PomDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	Properties prop;
	String browser;
	public TestBase()  {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Amit Jadhav\\eclipse-workspace\\PomDesign\\com.capgemini.config\\config.properties");
			try {
				prop.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Creo\\chromedriver_win32 (6)\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				
			}
		
	}	
			
			
	
	public void init() {
		driver.get(prop.getProperty("url"));
	}
	
	

}
