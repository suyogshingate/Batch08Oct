package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AyurvedaMedicineSearchResultPage {
	
	 //WebElement private
	
	 @FindBy (xpath = "(//div[@class='style__product-box___3oEU6'])[1]//a[1]")
	 private WebElement firstAdulsaOption;

	 //Constructor public
	 
	 public AyurvedaMedicineSearchResultPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods public
	 
	 public void firstOptionSelection() 
	 {
		 firstAdulsaOption.click();			 
	 }

}

