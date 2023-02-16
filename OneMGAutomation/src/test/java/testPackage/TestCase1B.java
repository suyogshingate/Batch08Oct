package testPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AyurvedaCartPage;
import pomClasses.AyurvedaLoginPopUpPage;
import pomClasses.AyurvedaMainPage;
import pomClasses.HomeOrMainPage;
import pomClasses.HomePagePopUps;
import pomClasses.PatanjaliPage;

public class TestCase1B {
	public static void main (String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver_win32 (2)\\chromedriver.exe");
	
	WebDriver driverT = new ChromeDriver();
	
	driverT.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driverT.manage().window().maximize();
	
	driverT.get("https://www.1mg.com");
	
	HomePagePopUps homePagePopUps = new HomePagePopUps(driverT);
	homePagePopUps.clickOnCloseAd();
	homePagePopUps.clickOnUpdateButton();
	
	Thread.sleep(2000);
	
	HomeOrMainPage homeOrMainPage = new HomeOrMainPage(driverT);
	homeOrMainPage.clickOnAyurveda();
	
	ArrayList<String> addr = new ArrayList<String>(driverT.getWindowHandles());
	driverT.switchTo().window(addr.get(1));
	
	AyurvedaMainPage ayurvedaMainPage = new AyurvedaMainPage(driverT);
	ayurvedaMainPage.hoverOnAyurvedaProducts();
	ayurvedaMainPage.clickOnPatanjaliLink();
	
	PatanjaliPage patanjaliPage = new PatanjaliPage(driverT);
	patanjaliPage.clickOnPatanCheckBox();
	patanjaliPage.clickOnSortOption();
	patanjaliPage.selectHighToLow();
	patanjaliPage.addMed1();
	patanjaliPage.addMed2();
	patanjaliPage.clickOnProceedToCartIcon();
	
	AyurvedaCartPage ayurvedaCartPage = new AyurvedaCartPage(driverT);
	//ayurvedaCartPage.checkTheSilverPackage();
	ayurvedaCartPage.clickOnCheckoutButton();
	
	AyurvedaLoginPopUpPage ayurvedaLoginPopUpPage = new AyurvedaLoginPopUpPage(driverT);
	ayurvedaLoginPopUpPage.enterMobileNumber();
	ayurvedaLoginPopUpPage.clickOnContinueButton();

}
}
