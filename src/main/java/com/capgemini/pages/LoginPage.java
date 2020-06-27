
package com.capgemini.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.org.PomDesign.TestBase;

public class LoginPage extends TestBase {

@FindBy(xpath="//*[@id='tel']")
WebElement mobileNo;
@FindBy(xpath="//*[text()='CONTINUE']")
		WebElement continuebtn;
public LoginPage() {
	PageFactory.initElements(driver, this);
}
public void enterCredentials(String mobNo) {
	mobileNo.sendKeys(mobNo);
}
public void clickCount() {
	continuebtn.click();
}
		
		
		
	}


