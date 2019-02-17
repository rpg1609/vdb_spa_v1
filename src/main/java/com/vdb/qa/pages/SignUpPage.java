package com.vdb.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vdb.qa.base.TestBase;

public class SignUpPage extends TestBase {

	//public static Properties 
	
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[1]/div/div")
		WebElement  regtForm ;
		
		@FindBy(xpath="//*[@class='cross']//a")
		WebElement  cancelRegistration;
		
		@FindBy(id="web_user_first_name")
		WebElement firstName;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[2]/div")
		WebElement  firstNameError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[1]/div/span")
		WebElement  firstNameMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[1]/div/span[2]")
		WebElement  firstNameMandateCrossError ;
		
		@FindBy(id="web_user_last_name")
		WebElement  lastName ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[4]/div")
		WebElement  lastNameError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[3]/div/span[1]")
		WebElement  lastNameMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[3]/div/span[2]")
		WebElement  lastNameMandateCrossError ;
		
		@FindBy(id="web_user_email")
		WebElement  emailAdd ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[7]/div")
		WebElement  emailAddError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[6]/div/span[1]")
		WebElement  emailAddMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[6]/div/span[2]")
		WebElement  emailAddMandateCrossError ;
		
		@FindBy(id="web_user_email_confirmation")
		WebElement  cEmailAdd ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[9]/div")
		WebElement  cEmailAddError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[8]/div/span[1]")
		WebElement  cEmailAddMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[8]/div/span[2]")
		WebElement  cEmailAddMandateCrossError ;
		
		@FindBy(id="web_user_title")
		WebElement  jobTitle;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[8]/div/div[2]/span/span[1]/span/ul/li/input")
		WebElement  businessType ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[13]/div")
		WebElement  businessTypeError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[12]/div/span[1]")
		WebElement  businessTypeMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[12]/div/span[2]")
		WebElement  businessTypeMandateCrossError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[2]/div[9]/div/div[2]/span/span[1]/span//input")
		WebElement  partOfBuyingGroup ;
		
		@FindBy(id="web_user_company_name")
		WebElement  compName ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[2]/div")
		WebElement  compNameError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[1]/div/span[1]")
		WebElement  compNameMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[1]/div/span[2]")
		WebElement  compNameMandateCrossError ;
		
		@FindBy(id="web_user_website")
		WebElement  compWebsite ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[5]/div/div[1]/div/span[1]")
		WebElement  mainPhoneMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[5]/div/div[1]/div/span[2]")
		WebElement  mainPhoneMandateCrossError ;
		
		@FindBy(id="web_user_phone_number")
		WebElement  mainPhone ;
		
		@FindBy(xpath="//*[@id='phone_type_one']//option[1]")
		WebElement  mainPhoneTypeDefault ;
		
		@FindBy(xpath="//*[@id='phone_type_one']//option[2]")
		WebElement  mainPhoneTypeOffice ;
		
		@FindBy(id="web_user_street_address")
		WebElement  compStAdd ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[8]/div")
		WebElement  compStAddError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[7]/div/span[1]")
		WebElement  compStAddMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[7]/div/span[2]")
		WebElement  compStAddMandateCrossError ;
		
		@FindBy(xpath="//*[@id='select2-web_user_country-container']/span")
		WebElement  country ;
		
		@FindBy(xpath="//*[@id='select2-web_user_country-result-lwq1-United States']")
		WebElement  countryUS ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[10]/div")
		WebElement  countryError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[9]/div/div/div[1]/div/span[1]")
		WebElement  countryMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[9]/div/div/div[1]/div/span[2]")
		WebElement  countryMandateCrossError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[7]/div/div/div[2]/div/div[2]/span/span[1]/span[1]/span[1]/span")
		WebElement  statePlaceholder ;
		
		@FindBy(xpath="//*[@id='select2-web_user_state-container']")
		WebElement  state ;
		
		@FindBy(xpath="//*[@id='select2-web_user_state-result-avqi-Alabama']")
		WebElement  stateAlabama ;
		
		@FindBy(xpath="//*[@id='select2-web_user_city-container']/span")
		WebElement  city ;
		
		@FindBy(xpath="//*[@id='select2-web_user_city-result-6kpw-Abbeville']")
		WebElement  cityAbbeville ;
		
		@FindBy(id="web_user_zip")
		WebElement  zip ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[12]/div")
		WebElement  cityError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[11]/div/div/div[1]/div/span[1]")
		WebElement  cityMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[3]/div[11]/div/div/div[1]/div/span[2]")
		WebElement  cityMandateCrossError ;
		
		@FindBy(id="web_user_heard_about_us")
		WebElement  hearAboutUs ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[2]/div")
		WebElement  hearAboutUsError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[1]/div/span[1]")
		WebElement  hearAboutUsMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[1]/div/span[2]")
		WebElement  hearAboutUsCrossError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[3]//preceding-sibling::text()")
		WebElement  createUrUserName ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[3]/span")
		WebElement  urEmailCanBeUsed ;
		
		@FindBy(id="web_user_username")
		WebElement  userName ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[5]/div")
		WebElement  userNameError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[4]/div/span[1]")
		WebElement  userNameMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[4]/div/span[2]")
		WebElement  userNameMandateCrossError ;
		
		@FindBy(xpath="//body/div[10]/div/div/div[2]/div")
		WebElement  userNameDialog ;
		
		@FindBy(xpath="//body/div[10]/div/div/div[3]/button[1]")
		WebElement  userNameDialogNo ;
		
		@FindBy(xpath="//body/div[10]/div/div/div[3]/button[2]")
		WebElement  userNameDialogYes ;
		
		@FindBy(id="web_user_username_confirmation")
		WebElement  cUserName ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[7]/div")
		WebElement  cUserNameError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[6]/div/span[1]")
		WebElement  cUserNameMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[6]/div/span[2]")
		WebElement  cUserNameMandateCrossError;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[8]//preceding-sibling::text()[1]")
		WebElement  createPswd ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[8]/span")
		WebElement  createPswdSubText ;
		
		@FindBy(id="web_user_password")
		WebElement  userPswd ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[10]/div")
		WebElement  userPswdError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[9]/div/span[1]")
		WebElement  userPswdMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[9]/div/span[2]")
		WebElement  userPswdMandateCrossError ;
		
		@FindBy(id="web_user_password_confirmation")
		WebElement  cUserPswd ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[12]/div")
		WebElement  cUserPswdError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[11]/div/span[1]")
		WebElement  cUserPswdMandateMark ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[4]/div[11]/div/span[2]")
		WebElement  cUserPswdMandateCrossError ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[5]/div[1]/div/span/label/span")
		WebElement  subscribeRadio ;
		
		@FindBy(xpath="//*[@id='new_web_user']/div/div/div[2]/div[5]/div[1]/div/span/label")
		WebElement  subscribeText ;
		
		@FindBy(xpath="//*[@class='round-light-purple-btn big']")
		WebElement  submitBtn ;
		
		@FindBy(xpath="//body/div[1]/div[2]/div[3]/div/div[1]/h2")
		WebElement  thanksMessage ;
		
		//Initializing the Page Objects:
		public SignUpPage(){
			PageFactory.initElements(driver, this);
		}
		
		public LoginPage cancelRegistration(){
			cancelRegistration.click();
			return new LoginPage();
		}
		
		
		public String getRegtFormText() {
			return regtForm.getText();
		}
		
		public String getFirstNameText() {
			return firstName.getAttribute("placeholder");
		}
		
		public String getFirstNameErrorText() {
			return firstNameError.getText();
		}
	
		public boolean getFirstNameMandateMarkPresence() {
			return firstNameMandateMark.isDisplayed();
		}
		
		public boolean getFirstNameCrossErrorPresence() {
			return firstNameMandateCrossError.isDisplayed();
		}
		
		public  WebElement  getFirstName() {
			return firstName;
		}
		
		public String getLastNameText() {
			return lastName.getAttribute("placeholder");
		}
		
		public String getLasttNameErrorText() {
			return lastNameError.getText();
		}
	
		public boolean getLastNameMandateMarkPresence() {
			return lastNameMandateMark.isDisplayed();
		}
		
		public boolean getLastNameCrossErrorPresence() {
			return lastNameMandateCrossError.isDisplayed();
		}
		
		public  WebElement getLastName() {
			return lastName;
		}
		
		public String getEmailAddText() {
			return emailAdd.getAttribute("placeholder");
		}
		
		public String getEmailAddErrorText() {
			return emailAddError.getText();
		}
	
		public boolean getEmailAddMandateMarkPresence() {
			return emailAddMandateMark.isDisplayed();
		}
		
		public boolean getEmailAddCrossErrorPresence() {
			return emailAddMandateCrossError.isDisplayed();
		}
		
		public  WebElement getEmailAdd() {
			return emailAdd;
		}
		
		public String getcEmailAddText() {
			return cEmailAdd.getAttribute("placeholder");
		}
		
		public String getcEmailAddErrorText() {
			return cEmailAddError.getText();
		}
	
		public boolean getcEmailAddMandateMarkPresence() {
			return cEmailAddMandateMark.isDisplayed();
		}
		
		public boolean getcEmailAddCrossErrorPresence() {
			return cEmailAddMandateCrossError.isDisplayed();
		}
		
		public  WebElement getcEmailAdd() {
			return cEmailAdd;
		}
		
		public String getJobTitleText() {
			return jobTitle.getAttribute("placeholder");
		}
		
		public  WebElement getJobTitle() {
			return jobTitle;
		}
		
		public String getBusinessTypeText() {
			return businessType.getAttribute("placeholder");
		}
		
		public String getBusinessTypeErrorText() {
			return businessTypeError.getText();
		}
	
		public boolean getBusinessTypeMandateMarkPresence() {
			return businessTypeMandateMark.isDisplayed();
		}
		
		public boolean getBusinessTypeCrossErrorPresence() {
			return businessTypeMandateCrossError.isDisplayed();
		}
		
		public  WebElement getBusinessType() {
			return businessType;
		}
		
		public String getPartOfBuyingGroupText() {
			return partOfBuyingGroup.getAttribute("placeholder");
		}
		
		public WebElement getPartOfBuyingGroup() {
			return partOfBuyingGroup;
		}
		
		public String getCompNameText() {
			return compName.getAttribute("placeholder");
		}
		
		public String getCompNameErrorText() {
			return compNameError.getText();
		}
	
		public boolean getCompNameMandateMarkPresence() {
			return compNameMandateMark.isDisplayed();
		}
		
		public boolean getCompNameCrossErrorPresence() {
			return compNameMandateCrossError.isDisplayed();
		}
		
		public  WebElement getcompName() {
			return compName;
		}
		
		public String getCompWebsiteText() {
			return compWebsite.getAttribute("placeholder");
		}
		
		public  WebElement getCompWebsite() {
			return compWebsite;
		}
	
		public boolean getMainPhoneMandateMarkPresence() {
			return mainPhoneMandateMark.isDisplayed();
		}
		
		public boolean getMainPhoneCrossErrorPresence() {
			return mainPhoneMandateCrossError.isDisplayed();
		}
		
		public  String getMainPhoneTypeDefault() {
			return mainPhoneTypeDefault.getText();
		}
		
		public  String getMainPhoneTypeOffice() {
			return mainPhoneTypeOffice.getText();
		}
		
		public  WebElement getMainPhone() {
			return mainPhone;
		}
		
		public String getCompStAddText() {
			return compStAdd.getAttribute("placeholder");
		}
		
		public boolean getCompStAddMandateMarkPresence() {
			return compStAddMandateMark.isDisplayed();
		}
		
		public boolean getCompStAddCrossErrorPresence() {
			return compStAddMandateCrossError.isDisplayed();
		}
		
		public String getCompStAddErrorText() {
			return compStAddError.getText();
		}
		
		public WebElement getCompStAdd() {
			return compStAdd;
		}
		
		public String getCountryText() {
			return country.getText();
		}
		
		public boolean getCountryMandateMarkPresence() {
			return countryMandateMark.isDisplayed();
		}
		
		public boolean getCountryCrossErrorPresence() {
			return countryMandateCrossError.isDisplayed();
		}
		
		public String getCountryErrorText() {
			return countryError.getText();
		}
		
		public WebElement getCountryUS() {
			return countryUS;
		}
		
		public String getStateText() {
			return state.getText();
		}
		
		public WebElement getStateAlabama() {
			return stateAlabama;
		}
		
		public String getCityText() {
			return city.getText();
		}
		
		public boolean getCityMandateMarkPresence() {
			return cityMandateMark.isDisplayed();
		}
		
		public boolean getCityCrossErrorPresence() {
			return cityMandateCrossError.isDisplayed();
		}
		
		public String getCityErrorText() {
			return cityError.getText();
		}
		
		public WebElement getCityAbbeville() {
			return cityAbbeville;
		}
		
		public String getZipText() {
			return zip.getAttribute("placeholder");
		}
		
		public  WebElement grtZip() {
			return zip;
		}
		
		public String getHearAboutUsText() {
			return hearAboutUs.getAttribute("placeholder");
		}
		
		public boolean getHearAboutUsMandateMarkPresence() {
			return hearAboutUsMandateMark.isDisplayed();
		}
		
		public boolean getHearAboutUsMandateCrossErrorPresence() {
			return hearAboutUsCrossError.isDisplayed();
		}
		
		public String getHearAboutUsErrorText() {
			return hearAboutUsError.getText();
		}
		
		public WebElement getHearAboutUs() {
			return hearAboutUs;
		}
		
		public String getCreateUsernameText() {
			return createUrUserName.getText();
		}
		
		public String getYourEmailCanBeUsedText() {
			return urEmailCanBeUsed.getText();
		}
		
		public String getUserNameText() {
			return userName.getAttribute("placeholder");
		}
		
		public boolean getUserNameMandateMarkPresence() {
			return userNameMandateMark.isDisplayed();
		}
		
		public boolean getUserNameMandateCrossErrorPresence() {
			return userNameMandateCrossError.isDisplayed();
		}
		
		public String getUserNameErrorText() {
			return userNameError.getText();
		}
		
		public WebElement getUserName() {
			return userName;
		}
		
		public String getcUserNameText() {
			return cUserName.getAttribute("placeholder");
		}
		
		public boolean getcUserNameMandateMarkPresence() {
			return cUserNameMandateMark.isDisplayed();
		}
		
		public boolean getcUserNameMandateCrossErrorPresence() {
			return cUserNameMandateCrossError.isDisplayed();
		}
		
		public String getçUserNameErrorText() {
			return cUserNameError.getText();
		}
		
		public WebElement getcUserName() {
			return cUserName;
		}
		
		public String getUserNameDialogText() {
			return userNameDialog.getText();
		}
		
		public boolean getUserNameDialogNoPresence() {
			return userNameDialogNo.isDisplayed();
		}
		
		public WebElement getUserNameDialogNo() {
			return userNameDialogNo;
		}
		
		public String getCreatePswdtext() {
			return createPswd.getText();
		}
		
		public String getCreatePswdSubText() {
			return createPswdSubText.getText();
		}
		
		public String getUserPswdText() {
			return userPswd.getAttribute("placeholder");
		}
		
		public boolean getUserPswdMandateMarkPresence() {
			return userPswdMandateMark.isDisplayed();
		}
		
		public boolean getUserPswdMandateCrossErrorPresence() {
			return userPswdMandateCrossError.isDisplayed();
		}
		
		public String getUserPswdErrorText() {
			return userPswdError.getText();
		}
		
		public WebElement getUserPswd() {
			return userPswd;
		}
		
		public String getcUserPswdText() {
			return cUserPswd.getAttribute("placeholder");
		}
		
		public boolean getcUserPswdMandateMarkPresence() {
			return cUserPswdMandateMark.isDisplayed();
		}
		
		public boolean getcUserPswdMandateCrossErrorPresence() {
			return cUserPswdMandateCrossError.isDisplayed();
		}
		
		public String getcUserPswdErrorText() {
			return cUserPswdError.getText();
		}
		
		public WebElement getcUserPswd() {
			return cUserPswd;
		}
		
		public  boolean getSubscribeRadioPresence() {
			return ((subscribeRadio.isSelected()) && (subscribeRadio.isEnabled()))   ;
		}
		
		public  String getSubscribeText() {
			return subscribeText.getText();
		}
		
		public  String getSubmitText() {
			return submitBtn.getAttribute("value");
		}
		
		public  WebElement clickSubmit() {
			return submitBtn;
		}
		
		public  String getThanksMessageText() {
			return thanksMessage.getText();
		}
		
		
		
}
