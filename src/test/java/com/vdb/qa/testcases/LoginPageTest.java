package com.vdb.qa.testcases;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.vdb.qa.base.TestBase;
import com.vdb.qa.pages.LoginPage;
import com.vdb.qa.pages.SearchHomePage;

public class LoginPageTest extends TestBase{
	
	LoginPage lp;
	SearchHomePage shp;
	public ExtentTest logger;
	
	public LoginPageTest(){
		super();
		
	}
	
	
	@BeforeTest
	public void setUp(){
		initialization();
		lp = new LoginPage();
		shp = new SearchHomePage();
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/vdb/qa/config/loginPage.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void Tear(){
		QuitBrowser();
		}
	
	@Test (priority=1)
	public void verifyUserNameText() {
		Assert.assertEquals(lp.getUserNameText(), prop.getProperty("lp.userNameText"));
	}
	
	@Test (priority=2)
	public void verifyPasswordText() {
		Assert.assertEquals(lp.getPasswordText(), prop.getProperty("lp.passwodText"));	
	}
	
	@Test (priority=3)
	public void verifyLoginBtnText() {
		Assert.assertEquals(lp.getLoginBtnText(), prop.getProperty("lp.loginButtonText"));	
	}
	
	@Test (priority=4)
	public void verifySignUpBtnText() {
		Assert.assertEquals(lp.getSignUpBtnText(), prop.getProperty("lp.signUpButtonText"));	
	}
	
	@Test (priority=5)
	public void verifySavePswdText() {
		Assert.assertEquals(lp.getSavePswdText(), prop.getProperty("lp.savePswdText"));	
	}
	
	@Test (priority=6)
	public void verifyForgotPswdText() {
		Assert.assertEquals(lp.getForgotPswdText(), prop.getProperty("lp.ForgotPswdText"));	
	}
	
	@Test (priority=7)
	public void verifyAlreadyAMemberText() {
		Assert.assertEquals(lp.getAlreadyAMemberText(), prop.getProperty("lp.AlreadyAMemberText"));	
	}
	
	@Test (priority=8)
	public void verifyNotRegisteredYetText() {
		Assert.assertEquals(lp.getNotRegisteredYetText(), prop.getProperty("lp.NotRegisteredYetText"));	
	}
	
	@Test (priority=9)
	public void verifyInvalidLoginErrorMessage() throws InterruptedException {
		
		//Validate Login error for blank username & password
		lp.invalidLogin("", "");
		Thread.sleep(2000);
		Assert.assertEquals(lp.getErrorMessage(), prop.getProperty("lp.errorMessageUserNameBlankAndPswdBlank"));

		//Validate Login error for only username 
		lp.invalidLogin("evion", "");
		Thread.sleep(2000);
		Assert.assertEquals(lp.getErrorMessage(), prop.getProperty("lp.errorMessageUserNameAndPswdBlank"));
		lp.clearUserNameText();
		
		//Validate Login error for only password 
		lp.invalidLogin("", "123");
		Thread.sleep(2000);
		Assert.assertEquals(lp.getErrorMessage(), prop.getProperty("lp.errorMessageUserNameBlankAndPswd"));
		lp.clearPasswordText();
				
		//validate when pswd & username both wrong
		lp.invalidLogin("wwww", "123");
		Thread.sleep(2000);
		Assert.assertEquals(lp.getErrorHeader(), prop.getProperty("lp.errorMessageUserNameWrongAndPswdWrong"));
		lp.clearUserNameText();
		lp.clearPasswordText();

	}
	
	
	@Test (priority=10)
	public void verifyValidLogin() {
		lp.login("evion", "VDB12345");
		Assert.assertEquals(prop.getProperty("shp.welcomeTabHeadingText"), shp.getWelcomeTabHeading());
		}
	
	
	
	@AfterMethod
	public void reportUpdate(ITestResult result) throws IOException{
	    //Take the Screenshot Only, If the Test is failed.
	    // Change the condition , If the screenshot needs to be taken for other status as well
	    if(ITestResult.FAILURE==result.getStatus()){
	        
	        String temp=result.getMethod().getMethodName()+".png";
	        captureScreenshot(driver,temp); 
		    //logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+temp));
		
	        
	    }
	}
	

	

}
