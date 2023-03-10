package com.telus.testcases;

/*
 * This Program is to automate the Demo site-Registration form submission process.
 * Register Demo End to End flow.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemo_Rahul {


	public static void main(String args[]) throws InterruptedException
	{

		//Set the system property for Chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create instance of the chrome driver
		WebDriver driver = new ChromeDriver();

		//Parameterize all the input values
		String url="https://nxtgenaiacademy.com/";
		String registrationFormTitle="Register For Demo";
		String firstNameValue= "TestFirstName";
		String lastNameValue= "TestLastName";
		String streetAddrValue= "101 Test Street";
		String apartmentNoValue= "67/32 Apt";
		String cityNameValue="Noida";
		String stateNameValue="Uttar Pradesh";
		String postalCodeValue="201303";
		String countryValue="India";
		String emailValue="testuser01@gmail.com";
		String demoDateValue="05/02/23";
		String hourValue="05";
		String minuteValue="15";
		String mobileNumberValue="8189878761";
		String enterYourQueryValue="What is the cost of these courses";
		String successfullRegistratonMsg="Registration Form is Successfully Submitted.";




		//Launch the application
		driver.get(url);

		//Maximize the window
		driver.manage().window().maximize();
		//Create instance of Action class
		Actions action = new Actions(driver);
		// Perform mouse hover on the Demo Sites link
		WebElement demoSites = driver.findElement(By.linkText("Demo Sites"));
		action.moveToElement(demoSites).perform();
		Thread.sleep(3000);
		// Perform mouse hover on the Practice Automation link
		WebElement practiceAutomation = driver.findElement(By.linkText("Practice Automation"));
		action.moveToElement(practiceAutomation).perform();
		Thread.sleep(3000);
		// Click on Demo Sites-Registration Form
		WebElement registrationForm = driver.findElement(By.partialLinkText("Registration Form"));
		registrationForm.click();

		//Identify the Registration Title
		WebElement regTitleText=driver.findElement(By.xpath("//*[normalize-space()='Register For Demo']"));

		//Verify Registration Title is displayed or not
		if(regTitleText.isDisplayed())
		{
			System.out.println("Registration Title is displayed");
		}
		else
		{
			System.out.println("Registration Title is not displayed");
		}
		//Validating Registration Title Text
		String actFormTitle = regTitleText.getText();
		String expFormTitle = registrationFormTitle;
		if(actFormTitle.equals(expFormTitle))
		{
			System.out.println("The Form title is same as expected: " +actFormTitle);
		}
		else
		{
			System.out.println("Form Title is not same ");
			System.out.println("The expected Form title is " +expFormTitle);
			System.out.println("The actual Form title is " +actFormTitle);
		}

		//Fill Registration Form

		//first name
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"vfb-5\"]"));
		//Verify First name is displayed or not
		if(firstName.isDisplayed())
		{
			System.out.println("First Name is displayed");
		}
		else
		{
			System.out.println("First Name is not displayed");
		}
		//Verify First name is Enabled or not
		if(firstName.isEnabled())
		{
			System.out.println("First Name is enabled");
			//Enter First Name
			firstName.sendKeys(firstNameValue);
			System.out.println("User's First Name is: "+firstNameValue);
		}
		else
		{
			System.out.println("First Name is not enabled");
		}



		//Last name
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"vfb-7\"]"));
		//Verify Last name is displayed or not
		if(lastName.isDisplayed())
		{
			System.out.println("Last Name is displayed");
		}
		else
		{
			System.out.println("Last Name is not displayed");
		}
		//Verify Last name is Enabled or not
		if(firstName.isEnabled())
		{
			System.out.println("Last Name is enabled");
			//Enter Last Name
			lastName.sendKeys(lastNameValue);
			System.out.println("User's Last Name is: "+lastNameValue);
		}
		else
		{
			System.out.println("Last Name is not enabled");
		}



		//Gender: male Radio Button
		WebElement maleRadioBtn = driver.findElement(By.xpath("//*[@id=\"vfb-31-1\"]"));
		//Verify Male Radio Button is displayed or not
		if(maleRadioBtn.isDisplayed())
		{
			System.out.println("Male Radio Button is displayed");
		}
		else
		{
			System.out.println("Male Radio Button is not displayed");
		}
		//Verify Male Radio Button is Enabled or not
		if(maleRadioBtn.isEnabled())
		{
			System.out.println("Male Radio Button is enabled");
		}
		else
		{
			System.out.println("Male Radio Button is not enabled");
		}
		//Verify Male Radio Button is Selected or not
		if(maleRadioBtn.isSelected())
		{
			System.out.println("Male Radio Button is Selected");
		}
		else
		{
			System.out.println("Male Radio Button is not Selected");
			//Select Male Radio Button
			maleRadioBtn.click();
			System.out.println("Male Radio Button is now Selected");


		}

		//Address
		//Street Address
		WebElement streetAddress = driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]"));
		//Verify Street Address is displayed or not
		if(streetAddress.isDisplayed())
		{
			System.out.println("Street Address is displayed");
		}
		else
		{
			System.out.println("Street Address is not displayed");
		}
		//Verify Street Address is enabled or not
		if(streetAddress.isEnabled())
		{
			System.out.println("Street Address is enabled");

			//Enter Street Address
			streetAddress.sendKeys(streetAddrValue);
			System.out.println("User's Street Address is: "+streetAddrValue);
		}
		else
		{
			System.out.println("Street Address is not enabled");
		}

		//Apartment Number
		WebElement apartmentNo = driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]"));
		//Verify Apartment Number is displayed or not
		if(apartmentNo.isDisplayed())
		{
			System.out.println("Apartment Number is displayed");
		}
		else
		{
			System.out.println("Apartment Number is not displayed");
		}
		//Verify Apartment Number is enabled or not
		if(apartmentNo.isEnabled())
		{
			System.out.println("Apartment Number is enabled");

			//Enter Apartment Number
			apartmentNo.sendKeys(apartmentNoValue);
			System.out.println("User Apartment Number is: "+apartmentNoValue);
		}
		else
		{
			System.out.println("Apartment Number is not enabled");
		}

		//City
		WebElement cityName = driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]"));
		//Verify City Name is displayed or not
		if(cityName.isDisplayed())
		{
			System.out.println("City Name is displayed");
		}
		else
		{
			System.out.println("City Name is not displayed");
		}
		//Verify City Name is enabled or not
		if(cityName.isEnabled())
		{
			System.out.println("City Name is enabled");

			//Enter City Name
			cityName.sendKeys(cityNameValue);
			System.out.println("User City Name is: "+cityNameValue);
		}
		else
		{
			System.out.println("City Name is not enabled");
		}

		//State
		WebElement stateName = driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]"));
		//Verify State Name is displayed or not
		if(stateName.isDisplayed())
		{
			System.out.println("State Name is displayed");
		}
		else
		{
			System.out.println("State Name is not displayed");
		}
		//Verify State Name is enabled or not
		if(stateName.isEnabled())
		{
			System.out.println("State Name is enabled");

			//Enter State Name
			stateName.sendKeys(stateNameValue);
			System.out.println("User State Name is: "+stateNameValue);
		}
		else
		{
			System.out.println("State Name is not enabled");
		}

		//Postal Code
		WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]"));
		//Verify Postal Code is displayed or not
		if(stateName.isDisplayed())
		{
			System.out.println("Postal Code is displayed");
		}
		else
		{
			System.out.println("Postal Code is not displayed");
		}
		//Verify Postal Code is enabled or not
		if(postalCode.isEnabled())
		{
			System.out.println("Postal Code is enabled");

			//Enter Postal Code
			postalCode.sendKeys(postalCodeValue);
			System.out.println("User Postal Code is: "+postalCodeValue);
		}
		else
		{
			System.out.println("Postal Code is not enabled");
		}

		//Country DropDown
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
		//Verify Country DropDown is displayed or not
		if(countryDropDown.isDisplayed())
		{
			System.out.println("Country DropDown is displayed");
		}
		else
		{
			System.out.println("Country DropDown is not displayed");
		}
		//Verify Country DropDown is enabled or not
		if(countryDropDown.isEnabled())
		{
			System.out.println("Country DropDown is enabled");

			//Create Object of Select Class and select Country value
			Select countryDropDownValue = new Select(countryDropDown);
			countryDropDownValue.selectByVisibleText(countryValue);
			System.out.println("Country Value selected is: "+countryValue);
		}
		else
		{
			System.out.println("Country DropDown is not enabled");
		}

		//Email
		WebElement email = driver.findElement(By.xpath("//*[@id=\"vfb-14\"]"));
		//Verify Email is displayed or not
		if(email.isDisplayed())
		{
			System.out.println("Email is displayed");
		}
		else
		{
			System.out.println("Email is not displayed");
		}
		//Verify Email is enabled or not
		if(email.isEnabled())
		{
			System.out.println("Email is enabled");

			//Enter Email
			email.sendKeys(emailValue);
			System.out.println("User Email is: "+emailValue);
		}
		else
		{
			System.out.println("Email is not enabled");
		}

		//Date of Demo

		WebElement dateOfDemo = driver.findElement(By.xpath("//*[@id=\"vfb-18\"]"));
		//Verify Date of Demo is displayed or not
		if(dateOfDemo.isDisplayed())
		{
			System.out.println("Date of Demo is displayed");
		}
		else
		{
			System.out.println("Date of Demo is not displayed");
		}
		//Verify Date of Demo is enabled or not
		if(dateOfDemo.isEnabled())
		{
			System.out.println("Date of Demo is enabled");

			//Enter Date of Demo 
			dateOfDemo.sendKeys(demoDateValue);
			System.out.println("Date of Demo is: "+demoDateValue);
		}
		else
		{
			System.out.println("Date of Demo is not enabled");
		}

		//Convenient Time: Hour Drop Down
		WebElement convinientTimeHour = driver.findElement(By.xpath("//*[@id=\"vfb-16-hour\"]"));
		//Verify Hour DropDown is displayed or not
		if(convinientTimeHour.isDisplayed())
		{
			System.out.println("Hour DropDown is displayed");
		}
		else
		{
			System.out.println("Hour DropDown is not displayed");
		}
		//Verify Hour DropDown is enabled or not
		if(convinientTimeHour.isEnabled())
		{
			System.out.println("Hour DropDown is enabled");

			//Create Object of Select Class and select hour value
			Select convinientHourDdValue = new Select(convinientTimeHour);
			convinientHourDdValue.selectByVisibleText(hourValue);
			System.out.println("Hour Value selected is: "+hourValue);
		}
		else
		{
			System.out.println("Hour DropDown is not enabled");
		}

		//Convinient Time : Minute DropDown
		WebElement convinientTimeMinute = driver.findElement(By.xpath("//*[@id=\"vfb-16-min\"]"));
		//Verify Minute DropDown is displayed or not
		if(convinientTimeMinute.isDisplayed())
		{
			System.out.println("Minute DropDown is displayed");
		}
		else
		{
			System.out.println("Minute DropDown is not displayed");
		}
		//Verify Minute DropDown is enabled or not
		if(convinientTimeMinute.isEnabled())
		{
			System.out.println("Minute DropDown is enabled");

			//Create Object of Select Class and select Minute value
			Select convinientMinuteDdValue = new Select(convinientTimeMinute);
			convinientMinuteDdValue.selectByVisibleText(minuteValue);
			System.out.println("Minute Value selected is: "+minuteValue);
		}
		else
		{
			System.out.println("Minute DropDown is not enabled");
		}

		//Mobile Number
		WebElement mobileNumber = driver.findElement(By.xpath("//*[@id=\"vfb-19\"]"));
		//Verify Mobile Number is displayed or not
		if(mobileNumber.isDisplayed())
		{
			System.out.println("Mobile Number is displayed");
		}
		else
		{
			System.out.println("Mobile Number is not displayed");
		}
		//Verify Mobile Number is enabled or not
		if(mobileNumber.isEnabled())
		{
			System.out.println("Mobile Number is enabled");

			//Enter Mobile Number
			mobileNumber.sendKeys(mobileNumberValue);
			System.out.println("User's Mobile Number is: "+mobileNumberValue);
		}
		else
		{
			System.out.println("Mobile Number is not enabled");
		}

		//Course Interested
		//UFT
		WebElement uftCheckBox = driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]"));
		//Verify UFT CheckBox is displayed or not
		if(uftCheckBox.isDisplayed())
		{
			System.out.println("UFT CheckBox is displayed");
		}
		else
		{
			System.out.println("UFT CheckBox is not displayed");
		}
		//Verify UFT CheckBox is Enabled or not
		if(uftCheckBox.isEnabled())
		{
			System.out.println("UFT CheckBox is enabled");
		}
		else
		{
			System.out.println("UFT CheckBox is not enabled");
		}
		//Verify UFT CheckBox is Selected or not
		if(uftCheckBox.isSelected())
		{
			System.out.println("UFT CheckBox is Selected");
		}
		else
		{
			System.out.println("UFT CheckBox is not Selected");
			//Select UFT CheckBox
			uftCheckBox.click();
			System.out.println("UFT CheckBox is now Selected");


		}

		//Selenium Webdriver

		WebElement seleniumWebDriverCheck = driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]"));
		//Verify Selenium Webdriver CheckBox is displayed or not
		if(seleniumWebDriverCheck.isDisplayed())
		{
			System.out.println("Selenium Webdriver CheckBox is displayed");
		}
		else
		{
			System.out.println("Selenium Webdriver CheckBox is not displayed");
		}
		//Verify Selenium Webdriver CheckBox is Enabled or not
		if(seleniumWebDriverCheck.isEnabled())
		{
			System.out.println("Selenium Webdriver CheckBox is enabled");
		}
		else
		{
			System.out.println("Selenium Webdriver CheckBox is not enabled");
		}
		//Verify Selenium Webdriver CheckBox Button is Selected or not
		if(seleniumWebDriverCheck.isSelected())
		{
			System.out.println("Selenium Webdriver CheckBox is Selected");
		}
		else
		{
			System.out.println("Selenium Webdriver CheckBox is not Selected");
			//Select Selenium Webdriver CheckBox
			seleniumWebDriverCheck.click();
			System.out.println("Selenium Webdriver CheckBox is now Selected");


		}

		//Enter your Query
		WebElement enterYourQuery = driver.findElement(By.xpath("//*[@id=\"vfb-23\"]"));
		//Verify Enter your query is displayed or not
		if(enterYourQuery.isDisplayed())
		{
			System.out.println("Enter your query is displayed");
		}
		else
		{
			System.out.println("Enter your query is not displayed");
		}
		//Verify Enter your query is Enabled or not
		if(enterYourQuery.isEnabled())
		{
			System.out.println("Enter your query is enabled");
			//Enter your query
			enterYourQuery.sendKeys(enterYourQueryValue);
			System.out.println("User's entered query is: "+enterYourQueryValue);
		}
		else
		{
			System.out.println("Enter your query is not enabled");
		}

		//Enter Any two digits

		WebElement enterTwoDigits = driver.findElement(By.xpath("//*[@id=\"vfb-3\"]"));
		//Verify Enter two digits is displayed or not
		if(enterTwoDigits.isDisplayed())
		{
			System.out.println("Enter two digits is displayed");
		}
		else
		{
			System.out.println("Enter two digits is not displayed");
		}
		//Verify Enter two digits is Enabled or not
		if(enterTwoDigits.isEnabled())
		{
			System.out.println("Enter two digits is enabled");
			//Retrieve the Verification Number
			String verificationText = driver.findElement(By.xpath("//*[normalize-space()='Example: 99']")).getText();
			String[] number = verificationText.split(":");
			String twoDigitNumber=number[1].trim();
			//Number Retrieve
			System.out.println("Number retrieved to enter is "+twoDigitNumber);
			enterTwoDigits.sendKeys(twoDigitNumber);
			System.out.println("The Number entered is "+twoDigitNumber);

		}
		else
		{
			System.out.println("Enter two digits is not enabled");
		}

		//Submit Button
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"vfb-4\"]"));
		//Verify Submit button is displayed or not
		if(submitButton.isDisplayed())
		{
			System.out.println("Submit button is displayed");
		}
		else
		{
			System.out.println("Submit button is not displayed");
		}
		//Verify Submit button is enabled or not
		if(submitButton.isEnabled())
		{
			System.out.println("Submit button is enabled");

			//Click on Submit button
			submitButton.click();
			System.out.println("Submit button is clicked");
		}
		else
		{
			System.out.println("Submit button is not enabled");
		}

		//Verifying successful submission of Registration form
		WebElement successfullMsgText = driver.findElement(By.xpath("//*[@class='elementor-widget-container']"));

		//Verify Successful message text is is displayed or not
		if(successfullMsgText.isDisplayed())
		{
			System.out.println("Successful message text is displayed");
		}
		else
		{
			System.out.println("Successful message text is not displayed");
		}

		String actSuccessfullMsgText =successfullMsgText.getText();
		String expSuccessfullMsgText= successfullRegistratonMsg;
		if(actSuccessfullMsgText.contains(expSuccessfullMsgText))
		{
			System.out.println("Actual and Expected Successful message are same");
			System.out.println("The successfull registration message is: "+actSuccessfullMsgText.substring(33,77));

			//Retrieve Transaction ID

			System.out.println("The Transaction ID is: "+actSuccessfullMsgText.substring(98,110));
		}
		else
		{
			System.out.println("Actual and Expected Successful message are not same");
		}


		//Close Application

		driver.quit();
		System.out.println("The Application got closed successfully");
	}

}
