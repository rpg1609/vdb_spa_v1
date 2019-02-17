package com.vdb.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vdb.qa.base.TestBase;
import com.vdb.qa.pages.LoginPage;
import com.vdb.qa.pages.SearchHomePage;
import com.vdb.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {

	LoginPage lp;
	SignUpPage sp;
	
	public SignUpPageTest(){
		super();
		
	}
	
	
	@BeforeTest
	public void setUp(){
		initialization();
		lp = new LoginPage();
		sp = new SignUpPage();	
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/vdb/qa/config/signUpPage.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lp.clickSignUp();
		
	}

	@Test (priority=1)
	public void verifySignUpPagePlaceHolderText() throws InterruptedException {
		
		Thread.sleep(5000);
		Assert.assertEquals(sp.getRegtFormText(), prop.getProperty("sp.regtForm"));
		Assert.assertEquals(sp.getFirstNameText(), prop.getProperty("sp.firstName"));
		Assert.assertEquals(sp.getLastNameText(), prop.getProperty("sp.lastName"));
		Assert.assertEquals(sp.getEmailAddText(), prop.getProperty("sp.emailAdd"));
		Assert.assertEquals(sp.getcEmailAddText(), prop.getProperty("sp.cEmailAdd"));
		Assert.assertEquals(sp.getJobTitleText(), prop.getProperty("sp.webUserTitle"));
		//Assert.assertEquals(sp.getBusinessTypeText(), prop.getProperty("sp.businessType"));
		Assert.assertEquals(sp.getPartOfBuyingGroupText(), prop.getProperty("sp.partOfBuyingGroup"));
		Assert.assertEquals(sp.getCompNameText(), prop.getProperty("sp.compName"));
		Assert.assertEquals(sp.getCompStAddText(), prop.getProperty("sp.compStAdd"));
		Assert.assertEquals(sp.getCountryText(), prop.getProperty("sp.country"));
		Assert.assertEquals(sp.getStateText(), prop.getProperty("sp.state"));
		Assert.assertEquals(sp.getCityText(), prop.getProperty("sp.city"));
		Assert.assertEquals(sp.getZipText(), prop.getProperty("sp.zip"));
		Assert.assertEquals(sp.getHearAboutUsText(), prop.getProperty("sp.hearAboutUs"));
		//Assert.assertEquals(sp.getCreateUsernameText(), prop.getProperty("sp.createUrUName"));
		//Assert.assertEquals(sp.getYourEmailCanBeUsedText(), prop.getProperty("sp.urEmailCanBeUsed"));
		Assert.assertEquals(sp.getUserNameText(), prop.getProperty("sp.userName"));
		Assert.assertEquals(sp.getcUserNameText(), prop.getProperty("sp.cUserName"));
		//Assert.assertEquals(sp.getCreatePswdtext(), prop.getProperty("sp.createPswd"));
		//Assert.assertEquals(sp.getCreatePswdSubText(), prop.getProperty("sp.createPswdSubText"));
		Assert.assertEquals(sp.getUserPswdText(), prop.getProperty("sp.userPswd"));
		Assert.assertEquals(sp.getcUserPswdText(), prop.getProperty("sp.cUserPswd"));
		Assert.assertEquals(sp.getSubscribeText(), prop.getProperty("sp.subscribeText"));
		Assert.assertEquals(sp.getSubmitText(), prop.getProperty("sp.submit"));
	}


}
