package pomClasses;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePagePopUps {
		 
		 //WebElements private
		
		 @FindBy (xpath = "//div[@class='style__close-icon___3FflV']")
		 private WebElement closeAdIcon;
		 
		 @FindBy (xpath = "//div[@data-auto-updatecity-update='true']")
		 private WebElement updateButton;
		 
		 //Constructor public
		 
		 public HomePagePopUps (WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		 
		 //Methods public
		 
		 public void clickOnCloseAd() 
		 {
			 closeAdIcon.click();
		 }
		 
		 public void clickOnUpdateButton() 
		 {
			 updateButton.click();
		 }
		
		

}


