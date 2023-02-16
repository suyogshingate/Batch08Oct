package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyurvedaMedicineProductPage {
	     
	     //WebElement private
	
		 @FindBy (xpath = "(//div[@class='style__cart-button___3CZnL'])[1]")
		 private WebElement addToCartButton;
		 
		 @FindBy (xpath = "//div[@data-auto-cart-counter='true']")
		 private WebElement proceedToCartIcon;

		 //Constructor public
		 
		 public AyurvedaMedicineProductPage (WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 
		 //Methods public
		 
		 public void clickOnAddToCart() 
		 {
			 addToCartButton.click();			 
		 }
		 
		 public void clickOnProceedToCartIcon() 
		 {
			 proceedToCartIcon.click();			 
		 }

}

