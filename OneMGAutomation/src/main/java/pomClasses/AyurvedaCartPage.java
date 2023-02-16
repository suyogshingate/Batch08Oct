package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyurvedaCartPage {
	 
	 //WebElement private
	
	 private WebDriver driver;
	
	 @FindBy (xpath = "//span[@class='Cart__checkbox___Cfykr style__checkbox___2KsPx']")
	 private WebElement silverPackageCheckbox;
	 
	 @FindBy (xpath = "//a[@class='t-dont-require-prescription Cart__desktop-button___2DRdC button-text']")
	 private WebElement checkoutButton;

	 //Constructor public
	 
	 public AyurvedaCartPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 this.driver =driver;
	 }
	 
	 //Methods public
	 
	 public void checkTheSilverPackage() 
	 {
		 silverPackageCheckbox.click();			 
	 }
	 
	 public void clickOnCheckoutButton() 
	 {
		 JavascriptExecutor jss = (JavascriptExecutor)driver;
		 jss.executeScript("arguments[0].scrollIntoView(true);",checkoutButton);
		 checkoutButton.click();			 
	 }
	 

}

