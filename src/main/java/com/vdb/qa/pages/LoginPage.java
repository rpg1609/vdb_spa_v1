package com.vdb.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vdb.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	
	//public static Properties 
	
	@FindBy(id="web_user_username")
	WebElement username;
	
	@FindBy(id="web_user_password")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement loginBtn;
	
	@FindBy(id="signup_link")
	WebElement signUpBtn;
	
	@FindBy(xpath="//span[@class='remember-me-icon vi switch_checkmark_white']"  )
	WebElement savePswdRadio;
	
	@FindBy(xpath="//span[@class='remember-me-label']")
	WebElement savePswdText;
	
	@FindBy(xpath="//*[@id='new_web_user']/div[3]/div/div[2]/a")
	WebElement forgotPaswd;
	
	@FindBy(xpath="//body/div[1]/div[2]/div[3]/div/div[1]/h2")
	WebElement NotRegisteredYetText;
	
	@FindBy(xpath="//body/div[1]/div[2]/div[3]/div/div[2]/h2")
	WebElement AlreadyAMemberText;
	
	@FindBy(xpath="//*[@id='new_web_user']/div[4]/div")
	WebElement errorInline;
	
	@FindBy(id="error_div")
	WebElement errorHeader;
	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	public boolean invalidLogin(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return true;

	}
	
	public SearchHomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new SearchHomePage();
	}
	
	public boolean clickSignUp(){
		signUpBtn.click();
		return true;
	}
	
	public WebElement getSignUp(){
		return signUpBtn;
	}
	
	
	public String getUserNameText() {
		return username.getAttribute("placeholder");
		}
	
	public boolean clearUserNameText() {
		username.clear();
		return true;
		}
	
	public String getPasswordText() {
		return password.getAttribute("placeholder");
		}
	
	public boolean clearPasswordText() {
		password.clear();
		return true;
		}
	
	public String getLoginBtnText() {
		return loginBtn.getAttribute("value");
		}
	
	public String getSignUpBtnText() {
		return signUpBtn.getText();
		}
	
	public String getSavePswdText() {
		return savePswdText.getText();
		}
	
	public String getForgotPswdText() {
		return forgotPaswd.getText();
		}
	
	public String getAlreadyAMemberText() {
		return AlreadyAMemberText.getText();
		}
	
	public String getNotRegisteredYetText() {
		return NotRegisteredYetText.getText();
		}
	
	public String getErrorMessage() {
		return errorInline.getText();
		}
	
	public String getErrorHeader() {
		return errorHeader.getText();
		}
	

	
}
