package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyurvedaLoginPopUpPage {
	     //WebElement private
	
		 @FindBy (xpath = "//input[@class='style__input___3NmkT']")
		 private WebElement mobileNumberInputBox;
		 
		 @FindBy (xpath = "(//a[@class='button-text'])[1]")
		 private WebElement continueButton;

		 //Constructor public
		 
		 public AyurvedaLoginPopUpPage (WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 
		 //Methods public
		 
		 public void enterMobileNumber() 
		 {
			 mobileNumberInputBox.sendKeys("8975698475");			 
		 }
		 
		 public void clickOnContinueButton() 
		 {
			 continueButton.click();			 
		 }
}

