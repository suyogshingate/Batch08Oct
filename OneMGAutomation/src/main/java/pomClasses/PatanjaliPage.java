package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatanjaliPage {
	 
	 private WebDriver driver;
	 private Actions act;	

	 //WebElement private

	 @FindBy (xpath = "(//label[@class='style__filter-label___3Jy6h']//input[@type='checkbox'])[1]")
	 private WebElement patanCheckBox;
	 
	 @FindBy (xpath = "//span[@id='sort-option']")
	 private WebElement sortOption;
	 
	 @FindBy (xpath = "//li[@data-key='price_high']")
	 private WebElement selectHighToLow;
	 
	 @FindBy (xpath = "(//div[@class='style__interaction___3cb12'])[1]")
	 private WebElement oilOption1;
	 
	 @FindBy (xpath = "(//div[@class='style__interaction___3cb12'])[4]")
	 private WebElement oilOption4;
	 
	 @FindBy (xpath = "//div[@data-auto-cart-counter='true']")
	 private WebElement proceedToCartIcon;
	 
	 //Constructor public
	 
	 public PatanjaliPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 this.driver = driver;
		 act = new Actions(driver);
	 }
	 
	 //Methods public
	 
	 public void clickOnPatanCheckBox() 
	 {
		 act.moveToElement(patanCheckBox).click().build().perform();
	 }
	 
	 public void clickOnSortOption() 
	 {
		 act.moveToElement(sortOption).click().build().perform();			 
	 }
	 
	 public void selectHighToLow() 
	 {
		 act.moveToElement(selectHighToLow).perform();
	 }
	 
	 public void addMed1() 
	 {
		 act.moveToElement(oilOption1).click().build().perform();			 
	 }
	 
	 public void addMed2() 
	 {
		 act.moveToElement(oilOption4).click().build().perform();
	 }
	 
	 public void clickOnProceedToCartIcon() 
	 {
		 proceedToCartIcon.click();			 
	 }

}

