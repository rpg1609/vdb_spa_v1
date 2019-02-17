package com.vdb.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vdb.qa.base.TestBase;
import com.vdb.qa.pages.LoginPage;
import com.vdb.qa.pages.SearchHomePage;

public class SearchHomePageTest extends TestBase {
	
	
	LoginPage lp;
	SearchHomePage shp;
	
	public SearchHomePageTest(){
		super();
		
	}
	
	
	@BeforeTest
	public void setUp(){
		initialization();
		lp = new LoginPage();
		shp = new SearchHomePage();
	}
	
	@Test (priority=1)
	public void verifyValidLogin() throws InterruptedException {
		lp.login(prop.getProperty("userName"), prop.getProperty("password"));
		Thread.sleep(5000);
		Assert.assertEquals(prop.getProperty("shp.welcomeTabHeadingText"), shp.getWelcomeTabHeading());
		shp.ClickOKWelcome();
		Thread.sleep(2000);
		
	}
	
	

}
