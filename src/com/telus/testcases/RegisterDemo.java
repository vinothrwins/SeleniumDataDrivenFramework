package com.telus.testcases;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.telus.utilities.ExcelUtility;


// 10th March 2023 - Code is updated by Rahul - Added the sysout message 

public class RegisterDemo {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public static void main(String[] args) throws InterruptedException, IOException{	

		String excelPath = ".\\TestData\\RegisterDemoTestData.xlsx";
		String sheetName = "RegisterUser";

		
		ExcelUtility excel = new ExcelUtility(excelPath,sheetName);
		int rowCount = excel.getRowCount();
		for(int row=1;row<rowCount;row++) {

			// Parameterized all Input Values
			String url = excel.getCellData(row, 0);		
			String regFormTitle = excel.getCellData(row, 1);		 
			String firstNameValue = excel.getCellData(row, 2);	
			String lastNameValue = excel.getCellData(row, 3);	
			String genderValue = excel.getCellData(row, 4);	
			String streetAddressValue = excel.getCellData(row, 5);	
			String apartmentValue = excel.getCellData(row, 6);	
			String cityNameValue = excel.getCellData(row, 7);	
			String stateNameValue = excel.getCellData(row, 8);	
			String postalCodeValue = excel.getCellData(row, 9);	
			String countryDrpDnValue = excel.getCellData(row, 10);	
			String emailValue = excel.getCellData(row, 11);	
			String dateOfDemoValue = excel.getCellData(row, 12);	
			String hourValue = excel.getCellData(row, 13);	
			String minuteValue = excel.getCellData(row, 14);	
			String mobileNumberValue = excel.getCellData(row, 15);	
			String seleniumWebdriverValue = excel.getCellData(row, 16);	
			String uftValue = excel.getCellData(row, 17);	
			String testNGValue = excel.getCellData(row, 18);	
			String coreJavaValue = excel.getCellData(row, 19);	
			String functionalTestingValue = excel.getCellData(row, 20);	
			String othersValue = excel.getCellData(row, 21);	
			String enterYourQueryValue = excel.getCellData(row, 22);	
			String successfulMessageText = excel.getCellData(row, 23);	

			// Parameterized all The WebElement Path
			String qaAutomationLocator = "//span[@class='text-wrap'][contains(text(),'QA Automation')]";
			String practiceAutomationLocator = "//span[@class='text-wrap'][contains(text(),'Practice Automation')]";
			String regTitleTextLocator = "//h3[contains(text(),'Register For Demo')]";
			String firstNameLocator = "vfb-5";
			String lastNameLocator = "vfb-7";
			String maleRdoBtnLocator = "vfb-31-1";
			String femaleRdoBtnLocator = "vfb-31-2";
			String stAddressNameLocator = "vfb-13[address]";
			String apartmentLocator = "vfb-13-address-2";
			String cityLocator = "vfb-13-city";
			String stateLocator = "vfb-13-state";
			String postalCodeLocator = "vfb-13-zip";
			String countryDrpDnLocator = "vfb-13-country";
			String emailLocator = "#vfb-14";
			String dateOfDemoLocator = "#vfb-18";
			String hourLocator= "vfb-16-hour";
			String minuteLocator = "vfb-16-min";
			String mobileNoLocator = "//input[@id='vfb-19']";
			String seleniumWebDriverLocator = "vfb-20-0";
			String uftLocator = "vfb-20-1";
			String testNGLocator = "vfb-20-2";
			String coreJavaLocator = "vfb-20-3";
			String functionalTestingLocator = "vfb-20-4";
			String othersLocator = "vfb-20-5";			
			String enterYourQueryLocator = "vfb-23";
			String enterTwoDigitsLocator = "vfb-3";
			String submitBtnLocator = "vfb-4";
			String successfulMsgTextLocator = "//*[@class='elementor-widget-container']";

			// Step:1 Set the system property and create object instance for the browser

			// To Set System Property
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			// To Create Driver Object in Driver Interface
			WebDriver driver = new ChromeDriver();

			System.out.println("Execution started");
			
			// Implicit Wait 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Step:2 Launch the Home URL

			// Launch the Home URL
			driver.get(url);

			// To Maximize Window
			driver.manage().window().maximize();
			System.out.println("Application is launched");

			// Step 3: Navigate to the register demo page
			
			//Create instance of Action class
			Actions action = new Actions(driver);
			// Perform mouse hover on the Demo Sites link
			WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));
			action.moveToElement(demoSites).perform();
	
			// Perform mouse hover on the Practice Automation link
			WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
			action.moveToElement(practiceAutomation).perform();
			
			// Click on Demo Sites-Registration Form
			WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
			registrationForm.click();

			System.out.println("Navigated to Register Demo Page");

			// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			// Step:4 Validate the Title of Form is displayed as "Register for Demo".

			// Register Demo Title 
			WebElement regTitleText = driver.findElement(By.xpath(regTitleTextLocator));
			// Verify Register Title is Displayed or not
			if (regTitleText.isDisplayed()) {
				System.out.println("Register Title is Displayed");
			} else {
				System.out.println("Register Title is not Displayed");
			}

			// Validating the Title 
			String actRegTitleText = regTitleText.getText();
			String expRegTitleText = regFormTitle;

			if (actRegTitleText.equals(expRegTitleText)) {
				System.out.println("The Register Title Text is: " + actRegTitleText);
			} else {
				System.out.println("Actual and expected Register Title Text are not same ");
				System.out.println("Actual Text is " + actRegTitleText);
				System.out.println("Expected Text is " + expRegTitleText);
			}

			// Step:5 Fill the Registration form by entering the all fields.

			// First name
			WebElement firstName = driver.findElement(By.id(firstNameLocator));
			// Verify the First Name is displayed or not
			if (firstName.isDisplayed()) {
				System.out.println("First Name is Displayed");
			} else {
				System.out.println("First Name is not Displayed");
			}

			// Verify the First Name is Enabled or not
			if (firstName.isEnabled()) {
				System.out.println("First Name is Enabled" );
				// Enter First Name
				firstName.sendKeys(firstNameValue);
				System.out.println("First Name Value is: " + firstNameValue);
			} else {
				System.out.println("First Name is not Enabled" );
			}

			// Last name
			WebElement lastName = driver.findElement(By.id(lastNameLocator));
			// Verify the Last Name is displayed or not
			if (lastName.isDisplayed()) {
				System.out.println("Last Name is Displayed");
			} else {
				System.out.println("Last Name is not Displayed");
			}

			// Verify the Last Name is enabled or not
			if (lastName.isEnabled()) {
				System.out.println("Last Name is Enabled");
				// Enter Last Name
				lastName.sendKeys(lastNameValue);
				System.out.println("Last Name Value is: " + lastNameValue);
			} else {
				System.out.println("Last Name is not Enabled");
			}

			// Gender
			WebElement maleRdoBtn = driver.findElement(By.id(maleRdoBtnLocator));
			WebElement femaleRdoBtn = driver.findElement(By.id(femaleRdoBtnLocator));

			if(maleRdoBtn.isEnabled() && genderValue.equalsIgnoreCase("Male")) {			
				System.out.println("Male Radio Button is Displayed");
				maleRdoBtn.click();
				System.out.println("Male Radio Button is Selected");
			}
			else if(femaleRdoBtn.isEnabled() && genderValue.equalsIgnoreCase("Female"))
			{
				System.out.println("Female Radio Button is Displayed");
				femaleRdoBtn.click();
				System.out.println("Female Radio Button is Selected");
			}
			else {
				System.out.println("Gender Radio Button is not enabled");
			}


			// Address
			// Street Address
			WebElement stAddress = driver.findElement(By.name(stAddressNameLocator));
			// Verify the Street Address is displayed or not
			if (stAddress.isDisplayed()) {
				System.out.println("Street Address is Displayed");
			} else {
				System.out.println("Street Address is not Displayed");
			}

			// Verify the  Street Address is enabled or not
			if (stAddress.isEnabled()) {
				System.out.println("Street Address is Enabled");
				// Enter Street Address
				stAddress.sendKeys(streetAddressValue);
				System.out.println("Street Address Value is: " + streetAddressValue);
			} else {
				System.out.println("Street Address is not Enabled");
			}

			// Apartment Number
			WebElement apartmentNo = driver.findElement(By.id(apartmentLocator));
			// Verify the Apartment Number is displayed or not
			if (apartmentNo.isDisplayed()) {
				System.out.println("Apartment Number is Displayed");
			} else {
				System.out.println("Apartment Number is not Displayed");
			}

			// Verify the Apartment Number is enabled or not
			if (apartmentNo.isEnabled()) {
				System.out.println("Apartment Number is Enabled");
				// Enter Apartment Number
				apartmentNo.sendKeys(apartmentValue);
				System.out.println("Apartment Number Value is: " + apartmentValue);	
			} else {
				System.out.println("Apartment Number is not Enabled");
			}

			// City
			WebElement cityName = driver.findElement(By.id(cityLocator));
			// Verify the City Name is displayed or not
			if (cityName.isDisplayed()) {
				System.out.println("City Name is Displayed");

			} else {
				System.out.println("City Name is not Displayed");
			}

			// Verify the City Name is enabled or not
			if (cityName.isEnabled()) {
				System.out.println("City Name is Enabled");
				// Enter City Name
				cityName.sendKeys(cityNameValue);
				System.out.println("City Name Value is : " + cityNameValue);
			} else {
				System.out.println("City Name is not Enabled");
			}

			// State
			WebElement stateName = driver.findElement(By.id(stateLocator));
			// Verify the State is displayed or not
			if (stateName.isDisplayed()) {
				System.out.println("State is Displayed");
			} else {
				System.out.println("State is not Displayed");
			}

			// Verify the State is enabled or not
			if (stateName.isEnabled()) {
				System.out.println("State is Enabled");
				// Enter State Name
				stateName.sendKeys(stateNameValue);
				System.out.println("State Value is : " + stateNameValue);
			} else {
				System.out.println("State is not Enabled");
			}

			// Postal/Zip code
			WebElement postalCode = driver.findElement(By.id(postalCodeLocator));
			// Verify the Postal Code is displayed or not
			if (postalCode.isDisplayed()) {
				System.out.println("Postal Code is Displayed");
			} else {
				System.out.println("Postal Code is not Displayed");
			}

			// Verify the Postal Code is enabled or not
			if (postalCode.isEnabled()) {
				System.out.println("Postal Code is Enabled");
				// Enter Postal Code
				postalCode.sendKeys(postalCodeValue);
				System.out.println("Postal Code Value is : " + postalCodeValue);
			} else {
				System.out.println("Postal Code is not Enabled");
			}

			// Country Drop Down
			WebElement countryDropDown = driver.findElement(By.id(countryDrpDnLocator));
			// Verify Country Drop Down is displayed or not
			if (countryDropDown.isDisplayed()) {
				System.out.println("Country Drop Down is Displayed");
			} else {
				System.out.println("Country Drop Down is not Displayed");
			}

			// Verify Country Drop Down is enabled or not
			if (countryDropDown.isEnabled()) {
				System.out.println("Country Drop Down is enabled");

				// To Select the Item from country DropDown, Create the Select Object
				Select countryDrpDn = new Select(countryDropDown);
				// Select Using Visible Text
				countryDrpDn.selectByVisibleText(countryDrpDnValue);
				System.out.println("Country Drop Down Value Selected is: " + countryDrpDnValue);

			} else {
				System.out.println("Country Drop Down is not enabled");
			}

			// Email
			WebElement email = driver.findElement(By.cssSelector(emailLocator));
			// Verify the Email is Displayed or not
			if (email.isDisplayed()) {
				System.out.println("Email is Displayed");
			} else {
				System.out.println("Email is not Displayed");
			}

			// Verify the Email is enabled or not
			if (email.isEnabled()) {
				System.out.println("Email is Enabled");
				// Enter Email Id
				email.sendKeys(emailValue);
				System.out.println("Email Id is: " + emailValue);
			} else {
				System.out.println("Email is not Enabled");
			}

			// Date of Demo
			WebElement dateOfDemo = driver.findElement(By.cssSelector(dateOfDemoLocator));
			// Verify the Mobile Number is Displayed or not
			if (dateOfDemo.isDisplayed()) {
				System.out.println("Date of Demo is Displayed");
			} else {
				System.out.println("Date of Demo is not Displayed");
			}

			// Verify the Date of Demo is enabled or not
			if (dateOfDemo.isEnabled()) {
				System.out.println("Date of Demo is Enabled");
				// Enter Date of Demo Value
				dateOfDemo.sendKeys(dateOfDemoValue);
				System.out.println("Date of Demo Value is: " + dateOfDemoValue);
			} else {
				System.out.println("Date of Demo is not Enabled");
			}

			// Convenient Time
			// Hour Drop Down
			WebElement convenientTimeHrDrpDn = driver.findElement(By.id(hourLocator));
			// Verify Convenient Time Hour Drop Down is Displayed or not
			if (convenientTimeHrDrpDn.isDisplayed()) {
				System.out.println("Hour DropDown is Displayed ");
			} else {
				System.out.println("Hour DropDown is not Displayed ");
			}

			// Verify Convenient Time Hour Drop Down is Enabled or not
			if (convenientTimeHrDrpDn.isEnabled()) {
				System.out.println("Hour DropDown is Enabled ");

				// To Select the Item from Convenient Time Hour DropDown, Create the Select Object
				Select hourDropDown = new Select(convenientTimeHrDrpDn);
				// Select Using Visible Text
				hourDropDown.selectByVisibleText(hourValue);
				System.out.println("Hour Drop Down Value is: " + hourValue);

			} else {
				System.out.println("Hour DropDown is not Enabled ");
			}

			// Minute Drop Down
			WebElement convenientTimeMinDrpDn = driver.findElement(By.id(minuteLocator));
			// Verify MM Drop Down is Displayed or not
			if (convenientTimeMinDrpDn.isDisplayed()) {
				System.out.println("Minute DropDown is Displayed");
			} else {
				System.out.println("Minute DropDown is not Displayed");
			}

			// Verify Minute Drop Down is Enabled or not
			if (convenientTimeMinDrpDn.isEnabled()) {
				System.out.println("Minute DropDown is Enabled");

				// To Select the Item from Minute DropDown, Create the Select Object
				Select minuteDropDown = new Select(convenientTimeMinDrpDn);
				// Select Using Visible Text
				minuteDropDown.selectByVisibleText(minuteValue);
				System.out.println("Minute Drop Down Value is: " + minuteValue);

			} else {
				System.out.println("Minute DropDown is not Enabled");
			}


			/*			// Convenient Time AM/PM Drop Down
			WebElement convenientTimeAmpmDrpDn = driver.findElement(By.id(amPmLocator));
			// Verify Convenient Time AM/PM Drop Down is Displayed or not
			if (convenientTimeAmpmDrpDn.isDisplayed()) {
				System.out.println("AM/PM DropDown is Displayed");
			} else {
				System.out.println("AM/PM DropDown is not Displayed");
			}

			// Verify Convenient Time AM/PM Drop Down is Enabled or not
			if (convenientTimeAmpmDrpDn.isEnabled()) {
				System.out.println("AM/PM DropDown is Enabled");

				// To Select the Item from AM/PM DropDown, Create the Select Object
				Select ampmDrpDown = new Select(convenientTimeAmpmDrpDn);
				// Select Using Visible Text
				ampmDrpDown.selectByVisibleText(ampmValue);
				System.out.println("AM/PM Drop Down Value is: " + ampmValue );

			} else {
				System.out.println("AM/PM DropDown is not Enabled");
			} */

			// Mobile Number
			WebElement mobileNumber = driver.findElement(By.xpath(mobileNoLocator));
			// Verify the Mobile Number is Displayed or not
			if (mobileNumber.isDisplayed()) {
				System.out.println("Mobile Number is Displayed");
			} else {
				System.out.println("Mobile Number is not Displayed");
			}

			// Verify the Mobile Number is enabled or not
			if (mobileNumber.isEnabled()) {
				System.out.println("Mobile Number is Enabled");
				// Enter Mobile Number
				mobileNumber.sendKeys(mobileNumberValue);
				System.out.println("Mobile Number Value is: " + mobileNumberValue);
			} else {
				System.out.println("Mobile Number is not Enabled");
			}

			// Course Interested
			WebElement seleniumWebDriverChkbox = driver.findElement(By.id(seleniumWebDriverLocator));
			WebElement uftChkbox = driver.findElement(By.id(uftLocator));
			WebElement testNGChkbox = driver.findElement(By.id(testNGLocator));
			WebElement coreJavaChkbox = driver.findElement(By.id(coreJavaLocator));
			WebElement functionalTestingChkbox = driver.findElement(By.id(functionalTestingLocator));
			WebElement othersChkbox = driver.findElement(By.id(othersLocator));

			// Selenium WebDriver Checkbox
			if(seleniumWebDriverChkbox.isEnabled()) {
				System.out.println("Selenium Webdriver Check Box is Enabled");
				if(seleniumWebDriverChkbox.isSelected() && seleniumWebdriverValue.equalsIgnoreCase("OFF")) {
					System.out.println("Selenium Webdriver Check Box is UnSelected");
					// Code to uncheck the checkbox
					seleniumWebDriverChkbox.click(); 
				}
				else if(seleniumWebdriverValue.equalsIgnoreCase("ON"))
				{
					// Code to check the checkbox
					seleniumWebDriverChkbox.click();
					System.out.println("Selenium Webdriver Check Box is Selected");
				}	
				else
				{
					System.out.println("Selenium Webdriver Check Box is not Enabled");
				}
			}	


			// UFT Checkbox
			if(uftChkbox.isEnabled()) {
				System.out.println("UFT Check Box is Enabled");
				if(uftChkbox.isSelected() && uftValue.equalsIgnoreCase("OFF")) {
					System.out.println("UFT Check Box is UnSelected");
					// Code to uncheck the checkbox
					uftChkbox.click(); 
				}
				else if(uftValue.equalsIgnoreCase("ON"))
				{
					// Code to check the checkbox
					uftChkbox.click();
					System.out.println("UFT Check Box is Selected");
				}			
			}	

			// TestNG Checkbox
			if(testNGChkbox.isEnabled()) {
				System.out.println("TestNG Check Box is Enabled");
				if(testNGChkbox.isSelected() && testNGValue.equalsIgnoreCase("OFF")) {
					System.out.println("TestNG Check Box is UnSelected");
					// Code to uncheck the checkbox
					testNGChkbox.click(); 
				}
				else if(testNGValue.equalsIgnoreCase("ON"))
				{
					// Code to check the checkbox
					testNGChkbox.click();
					System.out.println("TestNG Check Box is Selected");
				}			
			}	


			// Core Java Checkbox
			if(coreJavaChkbox.isEnabled()) {
				System.out.println("Core Java Check Box is Enabled");
				if(coreJavaChkbox.isSelected() && coreJavaValue.equalsIgnoreCase("OFF")) {
					System.out.println("Core Java Check Box is UnSelected");
					// Code to uncheck the checkbox
					coreJavaChkbox.click(); 
				}
				else if(coreJavaValue.equalsIgnoreCase("ON"))
				{
					// Code to check the checkbox
					coreJavaChkbox.click();
					System.out.println("Core Java Check Box is Selected");
				}			
			}	


			// Functional Testing Checkbox
			if(functionalTestingChkbox.isEnabled()) {
				System.out.println("Functional Testing Check Box is Enabled");
				if(functionalTestingChkbox.isSelected() && functionalTestingValue.equalsIgnoreCase("OFF")) {
					System.out.println("Functional Testing Check Box is UnSelected");
					// Code to uncheck the checkbox
					functionalTestingChkbox.click(); 
				}
				else if(functionalTestingValue.equalsIgnoreCase("ON"))
				{
					// Code to check the checkbox
					functionalTestingChkbox.click();
					System.out.println("Functional Testing Check Box is Selected");
				}			
			}	

			// Others Checkbox
			if(othersChkbox.isEnabled()) {
				System.out.println("Others Check Box is Enabled");
				if(othersChkbox.isSelected() && othersValue.equalsIgnoreCase("OFF")) {
					System.out.println("Others Check Box is UnSelected");
					// Code to uncheck the checkbox
					othersChkbox.click(); 
				}
				else if(othersValue.equalsIgnoreCase("ON"))
				{
					// Code to check the checkbox
					othersChkbox.click();
					System.out.println("Others Check Box is Selected");
				}			
			}	

			// Enter Your Query
			WebElement enterYourQuery = driver.findElement(By.id(enterYourQueryLocator));
			// Verify the Enter Your Query is Displayed or not
			if (enterYourQuery.isDisplayed()) {
				System.out.println("Enter Your Query is Displayed");

			} else {
				System.out.println("Enter Your Query is not Displayed");
			}

			// Verify the Enter Your Query is enabled or not
			if (enterYourQuery.isEnabled()) {
				System.out.println("Enter Your Query is Enabled");
				// Enter Your Query Value
				enterYourQuery.sendKeys(enterYourQueryValue);
				System.out.println("Enter Your Query is: " + enterYourQueryValue);
			} else {
				System.out.println("Enter Your Query is not Enabled");
			}

			// Enter Any Two Digits
			WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsLocator));
			// Verify the Enter Any Two Digits is Displayed or not
			if (enterTwoDigits.isDisplayed()) {
				System.out.println("Enter Any Two Digits is Displayed");
			} else {
				System.out.println("Enter Any Two Digits is not Displayed");
			}

			// Verify the Enter Any Two Digits is enabled or not
			if (enterTwoDigits.isEnabled()) {
				System.out.println("Enter Any Two Digits is Enabled");

				// Retrieve the Verification Number during run time and enter value.
				String text=driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/ul/li[1]/span/label")).getText();
				String num[]=text.split(":");    // Example : 84
				enterTwoDigits.sendKeys(num[1].trim());
				System.out.println("Enter Any Two Digits is: " + num[1]);
			} else {
				System.out.println("Enter Any Two Digits is not Enabled");
			}

			// Submit button
			WebElement submitBtn = driver.findElement(By.id(submitBtnLocator));
			// Verify The Submit Button is displayed or Not
			if (submitBtn.isDisplayed()) {
				System.out.println("Submit Button is Displayed ");
			} else {
				System.out.println("Submit Button is Not Displayed ");
			}

			// Verify The Submit Button is Enabled or Not
			if (submitBtn.isEnabled()) {
				System.out.println("Submit Button is Enabled");
				// Click on Submit Button
				submitBtn.click();
				System.out.println("Submit Button is Clicked");
			}

			System.out.println("Details are submitted");

			// Step:7 Submit the Form.
			WebElement successfulMsgText = driver.findElement(By.xpath(successfulMsgTextLocator));
			// Verify Successful message Text displayed or not
			if (successfulMsgText.isDisplayed()) {
				System.out.println("Successful Message Text is Displayed");			
			} else {
				System.out.println("Successful Message Text is not Displayed");
			}

			Thread.sleep(3000);
			
			boolean status = false;
			String actSuccessfullMsgText =successfulMsgText.getText();
			String expSuccessfullMsgText= successfulMessageText;
			if(actSuccessfullMsgText.contains(expSuccessfullMsgText))
			{
				System.out.println("Actual and Expected Successful message are same");
				System.out.println("The successfull registration message is: "+actSuccessfullMsgText.substring(33,77));

				//Retrieve Transaction ID

				System.out.println("The Transaction ID is: "+actSuccessfullMsgText.substring(98,110));
			    status = true;
			}
			else
			{
				System.out.println("Actual and Expected Successful message are not same");
				System.out.println("The actual registration message is: "+actSuccessfullMsgText);
				System.out.println("The expected registration message is: "+expSuccessfullMsgText);
			}

			/*	// Validating Successful Message Text
			String actSuccessfulMsgText = successfulMsgText.getText();
			String expSuccessfulMsgText = successfulMessageText;				

			// Retrieve the transaction number from the output message
			String arrMsg[]=actSuccessfulMsgText.split(":");    
			String transNum = arrMsg[1].trim();				

			boolean status = false;
			if (actSuccessfulMsgText.contains(expSuccessfulMsgText)) {
				System.out.println("The Successful Message Text is:  " + actSuccessfulMsgText);
				System.out.println("The Transaction Number is "+ transNum);
				status = true;		

			} else {
				System.out.println("Actual and expected Successful Msg Text are not same");
				System.out.println("Actual Text is: " + actSuccessfulMsgText);
				System.out.println("Expected Text is: " + expSuccessfulMsgText);
			} 
			*/

			// Close the application
			driver.quit();
			System.out.println("Application is Closed");


			FileInputStream fis = new FileInputStream(excelPath);
			workbook = new XSSFWorkbook(fis);			
			sheet = workbook.getSheetAt(0);			
			Row r = sheet.getRow(row);
			
		    // column for actual message 
			Cell cellMsg = r.createCell(24);
			
			Cell cellTransaction = r.createCell(25);
			
			Cell cellStatus = r.createCell(26);
			
			if(status) {
				cellMsg.setCellValue(actSuccessfullMsgText);
				cellTransaction.setCellValue(actSuccessfullMsgText.substring(98,110));
				cellStatus.setCellValue("Passed");
			}
			else
			{
				cellMsg.setCellValue(actSuccessfullMsgText);		
				cellStatus.setCellValue("Failed");
			}
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			workbook.write(fos);
			fos.close();
			
			
			
		}

	}
}


