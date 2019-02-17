package com.vdb.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vdb.qa.base.TestBase;

public class SearchHomePage extends TestBase{
	
	
	@FindBy(xpath="//*[@id='designUpdateModal']/div/div/div/div[1]/div[1]/h3[1]/strong")
	WebElement welcomeTabHeading;
	
	@FindBy(xpath="//*[@id='designUpdateModal']/div/div/div/div[2]/div[2]/a")
	WebElement welcomePageOKBtn;
	
	
	
	public SearchHomePage() {
	PageFactory.initElements(driver, this);
	try {
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/vdb/qa/config/searchHomePage.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	
	public String getWelcomeTabHeading() {
	return welcomeTabHeading.getText();
	}
	
	public void ClickOKWelcome() {
		 welcomePageOKBtn.click();
		}
	
	
	

}
