package pomClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyurvedaMainPage {
		 
		 private WebDriver driver;
		 private Actions act;	
	
		 //WebElement private
	
		 @FindBy (xpath = "//input[@placeholder='Enter your city']")
		 private WebElement cityInputBox;
		 
		 @FindBy (xpath = "//input[@id='srchBarShwInfo']")
		 private WebElement searchTextBox;
		 
		 @FindBy (xpath = "//div[@id='Ayurveda Products__6']")
		 private WebElement ayurvedaProductsDropdown;
		 
		 @FindBy (xpath = "//span[text()='Patanjali']")
		 private WebElement patanjaliLink;
		 
		 //Constructor public
		 
		 public AyurvedaMainPage (WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
			 this.driver = driver;
			 act = new Actions(driver);
		 }
		 
		 //Methods public
		 
		 public void typeCityNameAndEnter() 
		 {
			 cityInputBox.click();
			 cityInputBox.clear();
			 cityInputBox.sendKeys("Pune");
			 cityInputBox.sendKeys(Keys.ENTER);			 
		 }
		 
		 public void typeAyurMedNameAndEnter() 
		 {
			 searchTextBox.click();
			 searchTextBox.sendKeys("Adulsa");
			 searchTextBox.sendKeys(Keys.ENTER);			 
		 }
		 
		 public void hoverOnAyurvedaProducts() 
		 {
			 act.moveToElement(ayurvedaProductsDropdown).perform();
		 }
		 
		 public void clickOnPatanjaliLink() 
		 {
			 act.moveToElement(patanjaliLink).click().build().perform();			 
		 }

}

