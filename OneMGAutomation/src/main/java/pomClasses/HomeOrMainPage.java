package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOrMainPage {
	 
	 //WebElements private
	
	 @FindBy (xpath = "//a[@data-vars-event-label='Covid']")
	 private WebElement covid19Tab;
	 
	 @FindBy (xpath = "//a[@data-vars-event-label='Labs']")
	 private WebElement labTestsTab;
	
	 @FindBy (xpath = "//a[@data-vars-event-label='Ayurveda']")
	 private WebElement ayurvedaTab;
	 
	 @FindBy (xpath = "//a[@data-vars-event-label='Pharmacy']")
	 private WebElement medicinesTab;

	 //Constructor public
	 
	 public HomeOrMainPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods public
	 
	 public void clickOnLabTests() 
	 {
		 labTestsTab.click();
	 }
	 
	 public void clickOnAyurveda() 
	 {
		 ayurvedaTab.click();
	 }
	 
	 public void clickOnMedicines() 
	 {
		 medicinesTab.click();
	 }
	 
	 public void clickOnCovid19() 
	 {
		 covid19Tab.click();
	 }

}
